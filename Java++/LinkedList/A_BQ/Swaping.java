package A_BQ;

import java.util.Scanner;

public class Swaping {

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

	public static Node<Integer> swap(Node<Integer> head,int i, int j){
		
		if(i > j) {
			int t = i;
			i = j;
			j = t; 
		}
		
		if(i == 0 ) {
			Node<Integer> temp = head;
		
			int x = 0;
			while(x < j) {
				temp = temp.next;
				x++;
			}
			
			int s = head.data;
			head.data = temp.data;
			temp.data = s;
			
			return head;
		}
		
		Node<Integer> smallAns = swap(head.next, i-1, j-1);
		head.next = smallAns;
		
		return head;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter elements : ");
		Node <Integer> head = input();
		System.out.print("Entered list : ");
		print(head);
		
		System.out.println("\nEnter positions to be swapped : ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		head = swap(head,i,j);
		
		System.out.print("After swapping : ");
		print(head);
		
	}
}
