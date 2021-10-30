package A_BQ;

import java.util.Scanner;

public class FindNode {
	
	public static void print(Node <Integer>head) {
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
			else {
				tail.next = newNode;
				tail = newNode;
			}
			data = sc.nextInt();
		}
		return head; 
	}

	public static int find(Node <Integer> head, int num) {
		return find(head,num,0);
	}
	
	private static int find(Node <Integer> head, int num, int i) {
		if(head.data == num)
			return i;
		
		if(head.next == null && head.data != num)
			return -1;
		
		return find(head.next,num,++i);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter elements : ");
		Node <Integer> head = input();
		System.out.print("Entered list : ");
		print(head);
		
		Scanner sc = new Scanner (System.in);
		System.out.print("\nEnter number to be find : ");
		int numFind = sc.nextInt();
		System.out.println("index : "+find(head,numFind));
		
	}
	
}
