package BQ2;

import java.util.Scanner;

public class Delete_Recursion {

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
			Node newNode = new Node (data);
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
	
	public static Node deleteR(Node head, int pos) {
		if(pos == 0)
			return head.next;
		
		if(head == null)
			return head;
		
		head.next = deleteR(head.next, pos - 1);
		return head;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter elements :");
		Node head = input();
		System.out.println("Entered elements : ");
		print(head);

		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter position : ");
		int pos = sc.nextInt();
		
		head = deleteR(head, pos);
		
		System.out.print("After deleting : ");
		print(head);
	}
	
}
