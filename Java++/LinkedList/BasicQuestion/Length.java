package BasicQuestion;
import java.util.Scanner;
public class Length {

	public static int length (Node <Integer> head) {
		int i = 0;
		while (head != null) {
			i++;
			head = head.next;
		}
		return i;
	}
	
	public static Node <Integer> input(){
		Node<Integer> head = null, tail = null;
		
		Scanner sc = new Scanner (System.in);
		int data = sc.nextInt();
		
		while(data != -1) {
			Node <Integer> newNode = new Node(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;
			}
				data = sc.nextInt();
		}
		return head;
	}
	
	public static void print(Node <Integer> head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Number of time to run : ");
		int t = sc.nextInt();
		
		for(int i = 0; i < t ; i++ ) {
			System.out.println("Enter the elements ");
			Node <Integer> head = input();
			System.out.print("Elements are : ");
			print(head);
			System.out.println("\nLength : "+length(head));
		}
	}
}