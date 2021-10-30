package DoubleLinkList;

import java.util.Scanner;

public class Input_Print {

	public static void print (DoubleLinkedList head) {
		
		DoubleLinkedList temp = head;
			while(temp != head.prv) {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
			System.out.print(temp.data);
	}
	
	public static DoubleLinkedList input() {
		DoubleLinkedList head = null, tail = null;
		
		Scanner sc = new Scanner (System.in);
		int data = sc.nextInt();
		
		while(data != -1) {
			DoubleLinkedList newNode = new DoubleLinkedList (data);
			
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
			tail.next = newNode;
			newNode.prv = tail;
			tail = newNode;
			head.prv = newNode;
			newNode.next = head; }
			
			data = sc.nextInt();
		}
		return head;
	}
	
	public static void main (String [] args) {
	
		System.out.println("Enter list : ");
		DoubleLinkedList head = input();
		System.out.print("list : ");
		print(head);
		
	}	
}