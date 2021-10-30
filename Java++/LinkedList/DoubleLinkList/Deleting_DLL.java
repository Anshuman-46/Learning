package DoubleLinkList;

import java.util.Scanner;

public class Deleting_DLL {
	
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
			newNode.next = head; 
			}
			data = sc.nextInt();
		}
		return head;
	}

public static DoubleLinkedList delete(DoubleLinkedList head, int index) {

		if(index == 0) {					
			head.prv.next = head.next;
			head.next.prv = head.prv;
			return head.next;
		}
		
		DoubleLinkedList smallAns = delete(head.next, index - 1);
		
		smallAns.next = head.prv;
		head.prv.prv = head.next;
		
		return head;
}

	public static void main (String[] args) {
		System.out.println("Enter list : ");
		DoubleLinkedList head = input();
		System.out.print("list : ");
		print(head);
		
		System.out.print("\nEnter position : ");
		Scanner sc = new Scanner (System.in);
		int pos = sc.nextInt();
		
		head = delete(head, pos);
		
		System.out.print("After deleting : ");
		print(head);
	}

}
