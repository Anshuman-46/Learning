import java.util.Scanner;
public class LinkListUse {
	
//						first node to access all
	public static void print(Node <Integer> head) {
//		Node <Integer> temp = head; // use this otherwise head will be destroyed :(
		while (head != null) {  // as last node having null :)
//			don't use head.next in condition
			System.out.print(head.data+" ");  
			head = head.next; // address of next node (previous node storing next node's address)
		}
		System.out.println();
	}
	
//	-------------------------------------------------------------------------------------------------------------------------------
	
	public static Node <Integer> takeInput() {
		Node<Integer> head = null, tail = null ; // initially head is null
		
		Scanner sc = new Scanner (System.in);
		int data = sc.nextInt();  // got the number to be inserted in "linklist"
		
//		enter till user enter "-1"		
		while(data != -1) {
			Node <Integer> newNode = new Node <> (data);  // made the node where value have to be assigned
			
			if(head == null) { // initially head will be null, now start linking it 
				head = newNode; 
				tail = newNode;
			}
			
			else {
//				Node <Integer> temp = head; // to assign value next to head use it's reference
//				value should be putted at last of all value puuted till 
//				the only way to know last is that it's reference is "null"
			
//				while(temp.next != null /* most mistake */) { // increase the temp such that it reached the last node made till now
//					temp = temp.next; // when reached lastNode get out of the loop
//				}
//				temp.next = newNode; // now assign value as we have reached last value 
				tail.next = newNode; // don't set newNode.next :(
				tail = newNode; // tail = tail.next; 
			}
			data = sc.nextInt(); // enter the new value
		}
		return head; // now return head to get the whole access
	}

//	-------------------------------------------------------------------------------------------------------------------------------
	
	public static Node <Integer> insert(Node <Integer> head , int data, int index){
		
		Node <Integer> newNode = new Node <> (data);
		Node <Integer> temp = head;

		if(index == 0) {
			newNode.next = head; // head.next is not applicable as we have already null
//					or temp can also be used 
			return newNode;
		}
		
		int i = 0;
		while (i < index - 1) {
			temp = temp.next;
			i++;
		}
		newNode.next = temp.next;
		temp.next = newNode; // just to assign address of newNode to temp
//							not to assign temp to it
		return head;
	}
	
//	-------------------------------------------------------------------------------------------------------------------------------

	public static Node <Integer> delete(Node <Integer> head, int position){
		
		if(position == 0) {
			head = head.next;
			return head;
		}
		
		Node <Integer> temp = head;
		
		int i = 0;
		while(i < position - 1) {
			temp = temp.next;
			i++;
		}
//		head.next = head.next.next;  it can't be executed as it will only delete element at index : 1
		temp.next = temp.next.next;
		return head;
	}
	
	public static void main(String[] args) {

//		Node <Integer> node1 = new Node <Integer> (10); // using OOPS concept
//		System.out.println(node1.data); // data access
//		System.out.println(node1.next); // reference access
//	
//		Node <Integer> node2 = new Node <> (20); // second node
//// 		for linking we require that first node should store second node's reference/address
//		node1.next = node2;  // node1 stored second node's address
//		
//		System.out.println(node2);
//		System.out.println(node1.next);
		
//		className <generic> variableName = new className <> (if any);
//		Node <Integer> node1 = new Node <> (10);
//		Node <Integer> node2 = new Node <> (20);
//		Node <Integer> node3 = new Node <> (30);
//	
//		node1.next = node2;
//		node2.next = node3; // previous node storing next node's address
//		
//		Node <Integer> head = node1; // same node
//		by doing so : head = node1 (store address)
//		head.data = node1.data,  head.next = node1.next;
		
//		print(head); // just pass first node to access all
		
//		----------------------------------------------------------------------------------------------------

//		userInput in linkList
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter numbers : ");
		Node<Integer> head = takeInput();
		System.out.print("Elements are : ");
		print(head);
		
//		System.out.print("Enter the number to be added : ");
//		int numAdd= sc.nextInt();
//		
//		System.out.print("At which index : ");
//		int indexAdd = sc.nextInt();
//		
//		head = insert(head,numAdd,indexAdd);
//		System.out.print("After adding : ");
//		print(head);
		
		System.out.print("Enter index at which element to be deleted : ");
		int numDelete = sc.nextInt();
		head = delete(head,numDelete);
		
		System.out.print("After deleting : ");
		print(head);
	}
}