package DoubleLinkList;

public class DoubleLinkedList {

	int data;
	DoubleLinkedList next;
	DoubleLinkedList prv;
	
	public DoubleLinkedList (int data) {
		this.data = data;
		next = null;
		prv = null;
	}
}