package BQ2;

import java.util.Scanner;

public class Insert_Recursively {
	
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

	public static Node InsertR(Node head, int pos, int elem) {
		if(pos == 0) {
			Node newNode = new Node(elem);
			newNode.next = head;
			return newNode;
		}
		
		if(head == null)
			return head;
				
		head.next = InsertR(head.next, pos-1, elem);
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
		System.out.print("Enter number : ");
		int elem = sc.nextInt();
		
		head = InsertR(head,pos,elem);
		
		System.out.print("After insering : ");
		print(head);
	}	
}