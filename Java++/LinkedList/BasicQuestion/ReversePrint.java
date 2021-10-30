package BasicQuestion;

import java.util.Scanner;

public class ReversePrint {
	
	public static void print(Node <Integer> head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	
	public static Node <Integer> input(){
		Node <Integer> head = null, tail = null;
		
		Scanner sc = new Scanner (System.in);
		int data = sc.nextInt();
		
		while(data != -1) {
			Node <Integer> newNode = new Node <> (data);
			
			if(head == null) {
				tail = newNode;
				head = newNode;
			}
			
			tail.next = newNode;
			tail = newNode;
			
			data = sc.nextInt();
		}
		return head;
	}
	
	public static int get(Node <Integer> head,int position) {
		
		if(position > length(head))
			return -1;
		
		Node <Integer> temp = head;
		int i = 1;
		while(temp != null) {
			
			if(position == i)
				return temp.data;
			
			temp = temp.next;
			i++;
		}
		return 0;
	}
	
	public static int length(Node <Integer> head) {
		int i = 1;
		Node <Integer> temp = head;
		while(temp != null) {
			temp = temp.next;
			i++;
		}
		return i;
	}
	
	public static void reverseList(Node<Integer>head) {
		System.out.print("\nReverse list : ");

		for(int i = length(head) - 1; i > 0; i--) {
			System.out.print(get(head,i)+" ");
		}
	}
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Number of time to run : ");
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			
			System.out.println("Enter elements : ");
			Node<Integer> head = input();
			
			System.out.print("Elements are : ");
			print(head);
			
			reverseList(head);
			
			System.out.println();
		}
		
	}
}