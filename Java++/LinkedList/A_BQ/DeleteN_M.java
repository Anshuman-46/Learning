package A_BQ;

import java.util.Scanner;

public class DeleteN_M {

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
	
	public static void bd(Node <Integer> head, int m, int n) {
		Node <Integer> temp1 = head;
		Node <Integer> temp2 = head;
		
		while(temp1 != null && temp2 != null) {
//			temp2 = temp1;
			
			if(temp1.next == null)
				return;
			
			int i = 0;
			while(i < m - 1 && temp1 != null) {
				i++;
				temp1 = temp1.next;
				head = head.next;
			}
			
			temp2 = temp1;
			
			int j = 0;
			while(j <= n && temp2 != null) {
				j++;
				temp2 = temp2.next;
				head = head.next;
			}
			temp1.next = temp2;
			temp1 = temp2;
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter elements : ");
		Node <Integer> head = input();
		System.out.print("Entered list : ");
		print(head);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNumber of elements to be linked : ");
		int m = sc.nextInt();
		System.out.print("Number of elements to be deleted : ");
		int n = sc.nextInt();
		
		bd(head,m,n);
		
		System.out.print("After deleting : ");
		print(head);
//		head = head 
	}

}
