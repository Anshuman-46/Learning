package BasicQuestion;

public class AddingNode {

	public static void add(Node <Integer> head,int data) {
		Node <Integer> newNode = new Node (data);
		head.next = newNode;
	}
	
	public static void print(Node <Integer> head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	
	public static void main(String[] args) {
		
		Node <Integer> head = new Node(12);
		print(head); // before adding
		add(head,24); 
		
		System.out.println();
		print(head); // after adding
	}
	
}
