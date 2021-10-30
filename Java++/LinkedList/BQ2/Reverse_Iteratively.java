package BQ2;

import java.util.Scanner;

public class Reverse_Iteratively {

	
	public static void print(Node head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	
	public static Node input() {
		Node head = null, tail = null;
		
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		
		while(data != -1) {
			Node newNode = new Node(data);
			
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
	
	public static Node reverseI(Node head) {
		Node current = head;
		Node previous = null;
		Node temp;
		
		while(current != null) {
			temp = current.next;
			current.next = previous;
			previous = current;
			current = temp;
		}
		
//		at end : previous = head(reverseList), current = null
		return previous; 
	}

	public static void main(String [] args) {
		System.out.println("Enter elements : ");
		Node head = input();
		System.out.print("Entered list : ");
		print(head);
		Node Newhead = reverseI(head);
		System.out.print("\nReversed list : ");
		print(Newhead);
	}

}
