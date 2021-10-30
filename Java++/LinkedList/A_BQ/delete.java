package A_BQ;

import java.util.Scanner;

public class delete {

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
	
	public static Node <Integer> delete(Node<Integer>head, int pos){
		if(pos == 0)
			return head.next;
		
		Node <Integer> smallAns = delete(head.next, pos - 1);
		head.next = smallAns;
		
		return head;
	}
	public static void main(String[] args) {
		System.out.println("Enter elements : ");
		Node <Integer> head = input();
		System.out.print("Entered list : ");
		print(head);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter position :");
		int index = sc.nextInt();
		head = delete(head,index);
		System.out.print("After deleting : ");
		print(head);
	}
}
