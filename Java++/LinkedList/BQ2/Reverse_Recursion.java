package BQ2;

import java.util.Scanner;

public class Reverse_Recursion {

	public static void print(Node head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	
	public static Node input() {
		Node head = null, tail = null;
		
		Scanner sc = new Scanner (System.in);
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
	
	public static void main(String[] args) {
		System.out.println("Enter number ");
		Node head = input();
		System.out.print("Entered list : ");
		print(head);
		DoubleNode newHead = reverseRBetter(head);
		System.out.print("\nReversed list : ");
		print(newHead.head);
	}
	
	public static Node reverseR(Node head) {  // time complexity : O(n^2)
		if(head == null || head.next == null)
			return head;
		
		Node finalHead = reverseR(head.next);
		
		Node temp = finalHead;
		while(temp.next != null)
			temp = temp.next;
		
		temp.next = head; 
		head.next = null;
		
		return finalHead;
	}
	
	public static DoubleNode reverseRBetter (Node head) {
		if(head == null || head.next == null) {
			DoubleNode ans = new DoubleNode();
			ans.head = head;
			ans.tail = head;
			return ans;
		}
		DoubleNode smallAns = reverseRBetter(head.next);
		smallAns.tail.next = head;
		head.next = null;
		
		DoubleNode ans = new DoubleNode();
		ans.head = smallAns.head;
		ans.tail = head; // previous
		
		return ans;
	}
	
	public static Node reverseBest (Node head) {
		
//		head == null means no element is left
//		head.next == null means only one element is left no need to reverse it		
		if (head == null || head.next == null)
			return head;
		
//		we want to add head at last node which is currently head.next so store it 
//		no need to traverse
		Node reverseTail = head.next; // 2  (1 2 3)
		
		Node smallAns = reverseBest(head.next); // (3 2)
		reverseTail.next = head; // 2.next = head (1)
		head.next = null; // 1.next = null
		
		return smallAns;
	}
}

class DoubleNode {
	Node head;
	Node tail; 
}
