public class Node <T> {
// linkedlist <Node>
	T data;
	Node <T> next;
	
	public Node(T data) {
		this.data = data;
		next = null;
	}
}