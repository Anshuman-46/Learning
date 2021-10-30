package BasicQuestion;

import java.util.Scanner;

public class Deleting {
	
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
			
			else {
				tail.next = newNode;
				tail = newNode;
			}
			data = sc.nextInt();
		}
		return head;
	}
	
	public static Node <Integer> delete(Node <Integer> head,int position){
		int total = totalLink(head);
		
		if(position >= total)
			return head;
		
		Node <Integer> temp = head;
		if(position == 0) {
			head = head.next;
			return head;
		}
		int i = 0;
		while(i < position - 1) {
			temp = temp.next; 
			i++;		// V.V.I
		}
		
		temp.next = temp.next.next;
		return head;
	}
	
	public static int totalLink (Node<Integer> head) {
		int i = 0;
		while(head != null) {
			head = head.next;
			i++;
		}
		return i;
	}
	
	public static void main (String [] args) {
		
			Scanner sc = new Scanner (System.in);
		
			System.out.print("Number of time to run : ");
			int t = sc.nextInt();
		
			for(int i = 0 ; i < t ; i++){
			System.out.println("Enter elements : ");
			Node <Integer> head = input();
			
			System.out.print("Entered list : ");
			print(head);
			
			System.out.print("\nIndex at which element to delete : ");
			int deleteElement = sc.nextInt();
			
			Node <Integer> temp = delete(head,deleteElement);
			
			System.out.print("After deleting : ");
			print(temp);
			System.out.println();
		}
	}
}