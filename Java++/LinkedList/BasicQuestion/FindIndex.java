package BasicQuestion;

import java.util.Scanner;

public class FindIndex {
	
	public static void print(Node <Integer> head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	
	public static Node<Integer> input(){
		Node<Integer> head = null, tail = null;
		
		Scanner sc = new Scanner (System.in);
		int data = sc.nextInt();
		
		do {
			Node <Integer> newNode = new Node(data);
			
			 if(head == null) {
				 head = newNode;
				 tail = newNode;
			 }
			 else {
				 tail.next = newNode;
				 tail = newNode;
			 }
			 data = sc.nextInt();
		}	while(data != -1);
		
		return head;
	}
	
	public static int findIndex(Node<Integer>head,int element) {
		Node<Integer> temp = head;
		
		int i = 0;
		while(temp != null) {
			
			if(temp.data == element){
				return i;
			}
			else {
				temp = temp.next;
				i++;
			}
		}
		return -1;
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of time to run : ");
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			System.out.println("Enter elements ");
			Node <Integer> head = input();
			
			System.out.println("Elements are : ");
			print(head);
			
			System.out.println("\nEnter element to search : ");
			int element = sc.nextInt();
			
			System.out.println("Element at : "+findIndex(head,element)+" index");
		}
	}
	
}