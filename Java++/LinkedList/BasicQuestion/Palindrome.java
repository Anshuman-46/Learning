package BasicQuestion;

import java.util.Scanner;

public class Palindrome {

	// GOOD ONE !
	
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
				head = newNode;
				tail = newNode;
			}
			
			tail.next = newNode;
			tail = newNode;
			
			data = sc.nextInt();
		}
		return head;
	}
	
	public static int length(Node <Integer>head) {
		
		int i = 0;
		while(head != null) {
			head = head.next;
			i++;
		}
		return i;
	}
	
	public static int get (Node <Integer> head, int position) {
		if(position >= length(head))
			return -1;
		
		Node <Integer> temp = head;
		int i = 0;
		while(temp != null) {
			
			if(position == i)
				return temp.data;
			
			temp = temp.next;
			i++;
		}
		return -1;
	}
	
	public static boolean palindrome (Node <Integer>head) {
		
		for(int i = 0; i < length(head)/2; i++) {
			int j = length(head) - i - 1;
			
			if(get(head,i) == get(head,j))
				continue;
			
			else
				return false;
		}
		return true;
	}
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Number of time to run : ");
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			
			System.out.println("Enter elements : ");
			Node<Integer> head = input();
			
			System.out.print("Elements are : ");
			print(head);
			
			System.out.println("\nGiven list is "+palindrome(head)+" palindrome.");
		}	
		
	}
	
}