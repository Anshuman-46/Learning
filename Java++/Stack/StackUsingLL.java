public class StackUsingLL <T> {

	private Node <T> head;
	private int size;
	
	public StackUsingLL () {
		head = null;
		size = 0;
	}
	
	public int size () {
		return size;
	}
	
//	top = to return the top most value
//	user can even make "String", "Integer", "Float" etc...	
	public T top () throws StackEmptyException{
		if(size() == 0) {
			StackEmptyException e = new StackEmptyException ();
			throw e;
		}
		return head.data;	
	}
	
	public boolean isEmpty() {
		return (size() == 0); // or check head == null
	}
	
	public void push (T elem) {
		Node <T> newNode = new Node <> (elem);
		newNode.next = head;
		head = newNode;
		
		size++;
	}
	
	public T pop () throws StackEmptyException {
		if(size() == 0) {
//			StackEmptyException e = new StackEmptyException ();
//			throw e;
//			or  
			throw new StackEmptyException ();
		}
		T temp = head.data;
		head = head.next;
		size--;
		
//		for not returning value which has been poped =>
//		head = head.next;
//		size--;
		
		return temp;
	}
}