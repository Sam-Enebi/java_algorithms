
/**
* ADT MyQueue: Private Part<br>. 
* The class implements all the operations available in MyQueue<br>
*/
public class MyStaticQueue implements MyQueue {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------

	private int items[]; 
	private int numItems;
	private int maxItems;

	//-------------------------------------------------------------------
	//-------------------------------------------------------------------	
	//public myQueue myCreateEmpty(){}
	
	/**
	 * The constructor creates 1 instance (1 object) of the class MyStaticQueue<br>
	 * @param m: The maximum number of items MyQueue can contain.
	 */	 
	public MyStaticQueue(int m){
		this.items = new int[m];
		maxItems = m;
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyQueue is empty: isEmpty
	//-------------------------------------------------------------------	
	/**
	 * Given a concrete MyQueue, it returns whether it is empty or not.<br>
	 * @return: Whether MyQueue is empty or not.
	 */	
	public boolean isEmpty(){//TO-COMPLETE 
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		boolean res = true;

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		if(numItems != 0)
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
			res =false;
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------
		return res;
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get and remove first element from top of MyQueue: dequeue
	//-------------------------------------------------------------------
	/**
	 * Given a concrete MyQueue, it returns element at the top of the queue (if any).<br>
	 * @return: Head element from MyQueue (ERROR if there are no items in MyQueue).
	 */	
	public int dequeue(){
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		int res = -1;
		
		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		if(this.isEmpty()) {
			System.out.println("*Queue is empty!*");
			return res;
		}
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION
		//-----------------------------
		res = items[0];
		for(int i = 0; i < numItems -1; i++){
			items[i] = items[i+1];
		}
//		if (numItems < maxItems){
		items[numItems-1] =0;
//		}
		numItems--;
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------
		return res;
	}

		
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Add element to the top of MyQueue: enqueue
	//-------------------------------------------------------------------
	/**
	 * Given a concrete MyQueue, add an item to the back of the queue.<br>
	 * @param element: New item to be added to MyQueue.	 
	 */	
	public void enqueue(int element){
		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		if(numItems == maxItems){
			System.out.println("*Queue is full!*");
		}
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		else{
			items[numItems] =element;
			numItems++;
		}
	}
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> get the item at the top of myqueue: front
	//-------------------------------------------------------------------
	/**
	 * Given a concrete MyQueue, get the item at the top of the queue..<br>
	 * @return: item at top of  MyQueue.	 
	 */	
	public int front(){
		//-----------------------------
		//SET OF OPS
		//-----------------------------
		int res = -1;
		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		if(isEmpty()){
			System.out.println("*Queue is empty!*");
			return res;
		}
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		res = items[0];
		return res;
	}
		
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> get the item at the top of myqueue: front
	//-------------------------------------------------------------------
	/**
	* Given a concrete MyQueue, get the item at the back of the queue..<br>
	* @return: item at back of  MyQueue.	 
	*/	
	public int rear(){
		//-----------------------------
		//SET OF OPS
		//-----------------------------
		int res = -1;
		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		if(isEmpty()){
			System.out.println("*Queue is empty!*");
			return res;
		}
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		res = items[numItems-1];
		return res;
	}
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> prints all the elements from MyQueue: print
	//-------------------------------------------------------------------
	/**
	 * Given a concrete MyQueue, prints all the elements (if any).<br>
	 * 
	 */	
	public void print(){
		
		//-----------------------------
		//SET OF OPS
		//-----------------------------
		String res = "[";
		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		if(isEmpty()){
			res = "[";
		}
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		else{
			for(int i = 0; i < numItems - 1 ; i++){
				res = res  + items[i] + ",  ";
			}
			res = res + items[numItems-1];
		}
		System.out.println(res+" ]");
	}
}
