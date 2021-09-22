
/**
* ADT MyQueue: Private Part<br>. 
* The class implements all the operations available in MyQueue<br>
*/
public class MyDynamicQueue implements MyQueue {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
	private MyNode head;

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyQueue is empty: myCreateEmpty
	//-------------------------------------------------------------------	
	//public myQueue myCreateEmpty(){}
	
	public MyDynamicQueue(){
		this.head = null;
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyQueue is empty: isEmpty
	//-------------------------------------------------------------------	

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
		if(head != null)
			res =false;
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------

		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------
		return res;
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get and remove first element from top of MyQueue: dequeue
	//-------------------------------------------------------------------

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
		res = this.head.getInfo();
		this.head = this.head.getNext();
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------
		return res;
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Add element to the top of MyQueue: enqueue
	//-------------------------------------------------------------------
	
	public void enqueue(int element){
		//-----------------------------
		//SET OF OPS
		//-----------------------------
		MyNode newNode = new MyNode(element, null);
		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		if(isEmpty()){
			this.head = newNode;
		}
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		else {
			MyNode temp = this.head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(newNode);
		}
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
		MyNode temp = this.head;
		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		if(isEmpty()){
			System.out.println("*Queue is empty!");
			return res;
		}
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION
		//-----------------------------
		while (temp.getNext()!= null){
			temp = temp.getNext();
		}
		res = temp.getInfo();
		return res;
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
			System.out.println("*Queue is empty!");
			return res;
		}
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		res = this.head.getInfo();
		return res;
	}	
	
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> prints all the elements from MyQueue: print
	//-------------------------------------------------------------------
	
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
			MyNode temp = this.head;
			while(temp.getNext() != null){
				res = res + temp.getInfo() + ", ";
				temp = temp.getNext();
			}
			res = res + temp.getInfo();
		}
		System.out.println(res+" ]");
	}
}
