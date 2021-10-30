//  T : due to generic
public class Node <T> {

	T data; // information
	Node <T> next;
//	class storing next <T>'s reference/address	
	
	// constructor
	Node(T data){ // default
		this.data = data;
		next = null; // assuming that their is no further data
	}
	
}
