package BQ2;

import java.util.Scanner;

public class Insert_Iteratively {

	
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
	
	public static int length(Node head) {
		int i = 0;
		while(head != null) {
			head = head.next;
			i++;
		}
		return i;
	}
	
	public static Node insertI(Node head,int pos, int element) {
		
		Node newNode = new Node(element);
		Node temp = head;
		
		if(pos == 0) {
			newNode.next = head;
			return newNode;
		}
		
		if(pos > length(head))
			return head;
		
		int i = 0;
		while(i < pos - 1) {
			temp = temp.next;
			i++;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		
		return head;
	}
	
	public static void main(String []args) {
		System.out.println("Enter elements ");
		Node head = input();
		
		System.out.print("Entered elements : ");
		print(head);
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter position : ");
		int pos = sc.nextInt();
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		
		head = insertI(head,pos,num);
		
		System.out.print("After inserting : ");
		print(head);
	}
	

}
