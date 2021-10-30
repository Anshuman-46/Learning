package BasicQuestion;

import java.util.Scanner;

public class LinearSearch {

	public static Node <Integer> input (){
		
		Node <Integer> head = null, tail = null;
		
		System.out.println("Enter numbers : ");
		Scanner sc = new Scanner (System.in);
		int data = sc.nextInt();
				
		while(data != -1) {
			Node <Integer> newNode = new Node (data);
			
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

	public static void print(Node <Integer> head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	
	public static int LinearSearch(Node <Integer> head, int x) {
		Node <Integer> temp = head;
		int i = 0;
		while(temp != null) {
			
			if(temp.data == x) 
				return i;
			
			else {
				temp = temp.next ;
				i++;
			}
		}
		return -1;
	}
	
	
//	Time complexity : O(n) i.e., n = number of elements
	
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
		Node <Integer> head = input();
		print(head);
		
		System.out.print("\nNumber to be search : ");
		int search = sc.nextInt();
		
		System.out.println("Index : "+LinearSearch(head,search));
	}
}
