
/**
 * The class contains the Divide and Conquer-based Algorithms we are using. 
 */
public class DivideAndConquerAlgorithms {

	//----------------------------------------------
	// Class constructor
	//----------------------------------------------	
	/**
	 * Constructor of the class. Do not edit it.
	 */
	public DivideAndConquerAlgorithms(){}
	
	//-------------------------------------------------------------------
		// 0. iterativeDisplayElements --> Displays all elements of a MyList 
		//-------------------------------------------------------------------	
		/**
		 * Given a concrete MyList, this iterative algorithm displays its elements by screen (if any).
		 * @param m: The MyList we want to display its elements.	  
		 */	
		public void iterativeDisplayElements(MyList<Integer> m){
			//-----------------------------
			//SET OF OPS
			//-----------------------------

			//-----------------------------
			// I. SCENARIO IDENTIFICATION
			//-----------------------------
			int scenario = 0; 
			
			//Rule 1. MyList is empty
			if (m.length() == 0) 
				scenario = 1;
			//Rule 2. MyList is non-empty
			else
				scenario = 2;

			//-----------------------------
			// II. SCENARIO IMPLEMENTATION 
			//-----------------------------
			switch(scenario){	
					
			//Rule 1. MyList is empty
			case 1: 
				//1. We print the empty message
				System.out.println("Empty MyList");
				
				break;
				
			//Rule 2. MyList is non-empty
			case 2: 
				//1. We print the initial message
				int size = m.length();
				System.out.println("MyList Contains the following " + size + " items: ");
				
				//2. We traverse the items
				for (int i = 0; i < size; i++)
					System.out.println("Item " + i + ": " + m.getElement(i));
				
				break;
		
			}
			
		}	
	//-------------------------------------------------------------------
	// 1. getEven --> Finds the even numbers in MyList 
	//-------------------------------------------------------------------	
	/**
	 * The function finds the even number in m. 
	 * @param m: The MyList we want to compute its maximum item.
	 * @return: A new MyList containing only the even numbers present in m	  
	 */
	private MyList<Integer> even = new MyDynamicList<>();
	int i = 0;
	public MyList<Integer> getEven(MyList<Integer> m){
			 // TO-DO
		if(i == m.length()) {
			i =0;
			MyList<Integer> result = even;
			even = new MyDynamicList<>();
			return result;
		}

		if(m.getElement(i)%2 == 0){
			even.addElement(even.length(),m.getElement(i));
			i++;
			return getEven(m);
		}

		i++;
		return getEven(m);
	}

	//-------------------------------------------------------------------
	// 2. getProduct --> Computes if MyList is sorted in decreasing order 
	//-------------------------------------------------------------------	
	/**
	 * The function computes the product of all items in m.  
	 * @param m: The MyList we want to check.
	 * @return: The product value calculated.  
	 */
	int j = 0;
	public int getProduct(MyList<Integer> m){
		if(j==m.length()){
			if(j==0)
				return -1;
			else {
				j = 0;
				return 1;
			}
		}
		return m.getElement(j++)*getProduct(m);
	}

	//-------------------------------------------------------------------
	// 3. isEqual --> Determines if two MyLists are identical  
	//-------------------------------------------------------------------	
	/**
	 * The function determines is m1 and m2 are identical.   
	 * @param m1, m2: The two MyLists we want to compare.
	 * @return: True or false 
	 */
	private int k=0;
	public boolean isEqual(MyList<Integer> m1, MyList<Integer> m2){
			 if(m1.length()!= m2.length())
			 	return false;

			 if(k== m1.length()) {
			 	k=0;
			 	return true;
			 }

			 int m1_item = m1.getElement(k);
			 int m2_item = m2.getElement(k);
			 k=k+1;
			 return (m1_item == m2_item) && isEqual(m1, m2);
	}
	
		
	//-------------------------------------------------------------------
	// 4. fermat --> Computes the n-est term of the Fermat series
	//-------------------------------------------------------------------	
	/**
	 * The function computes the n-est term of the Fermat series
	 * @param n: The n-est term of the series we want to compute
	 * @return: The term being computed 
	 */	
	public int fermat(int n){
		return (int)Math.pow(2, Math.pow(2,n))+1;
	}
		
}
