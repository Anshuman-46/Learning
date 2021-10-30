public class StackUsingArray {

	private int data []; // private no one should access it from outside
	private int top; // index of topmost element
	
	public StackUsingArray () {
		data = new int [10];
		top = -1; // initially no element
	}

//	either user tell the size or just made stackobject
	
	public StackUsingArray (int capacity) {
		data = new int [capacity];
		top = -1;
	}
	
	public boolean isEmpty() {
//		if(top == -1)
//			return true;
//		else 
//			return false;
//		or
		return (top == -1); // if top == -1 means no element then true else false
	}
	
	public int size() {
		return top + 1;
	}
	
	public int top () throws StackEmptyException {
		if(size() == 0) {
//			StackEmptyException
//			StackEmptyException e = new StackEmptyException ();
//			throw e;
			throw new StackEmptyException ();
		}
		return data[top];
	}
	
//	inserting element at TOS
	public void push (int elem) /*throws StackFullException */ {
		if(size() == data.length) {
			// Stack Full
//			StackFullException e = new StackFullException ();
//			throw e;
//			or we can use dynamic array concept
			restructure();
		}
		top++;
		data[top] = elem;
	}
	
	private void restructure() {
		int temp [] = data;
		data = new int [temp.length * 2];
		
		for(int i = 0; i < temp.length ;i++)
			data[i] = temp[i];
	}
	
	public int pop () throws StackEmptyException {
		if(size() == 0) { // if stack is empty then can do "pop"
			// StackEmptyException
//			StackEmptyException e = new StackEmptyException ();
//			throw e;
			throw new StackEmptyException ();
		}
		
		int temp = data[top]; //=> if want to return the element which has been deleted
		top--;
		return temp;
		
//		top--; 
//		return; if want to do not return value whatever have been deleted
	}	
}