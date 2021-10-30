package BasicQuestion;

import java.util.Scanner;

public class MoveToFirst {
	
	public  static void print(Node <Integer> head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	
	public static Node <Integer> input (){
		Node <Integer> head = null, tail = null;
		
		Scanner sc = new Scanner (System.in);
		int data = sc.nextInt();
		
		while(data != -1) {
			Node <Integer> newNode = new Node <> (data);
			
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
	
	public static int length(Node <Integer> head) {
		int i = 1;
		while(head != null) {
			head = head.next;
			i++;
		}
		return i;
	}
	
	public static Node <Integer> move(Node<Integer>head,int position){

		int total = length(head);
		Node<Integer> temp = head;
		
		int i = 0 ;
		while(i < (total - position) - 1) { // - 1 added
			temp = temp.next;
			i++;
		}
		
		Node<Integer> newhead = temp.next; // .next added
		Node<Integer> newtemp = temp;
		
		while(i < total - 1 ) {
			temp = temp.next;
			i++;
		}
		temp.next = head;
		newtemp.next = null; // here added from line 59

		return newhead;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Number of time to run : ");
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			
			System.out.println("Enter elements : ");
			Node<Integer> head = input();
			
			System.out.print("Elements are : ");
			print(head);
			
			System.out.print("\nNumber of time to move list : ");
			int n = sc.nextInt();
			
			Node<Integer> newHead = move(head,n);
			System.out.print("Elements after moving : ");
			print(newHead);
		
		}	
	}
}