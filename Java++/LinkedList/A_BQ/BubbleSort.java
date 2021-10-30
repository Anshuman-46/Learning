package A_BQ;

import java.util.Scanner;

public class BubbleSort {

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
	
	public static int length(Node<Integer> head) {
		int i = 0;
		while(head != null) {
			i++;
			head = head.next;
		}
		return i;
	}
	
	public static Node<Integer> get(Node <Integer> head, int x){
		if(x == 0)
			return head;
		
		Node<Integer> smallAns = get(head.next,x - 1);
		return smallAns;
	}
	
	public static int getData(Node <Integer> head, int x) {
		int i = 0;
		while(i < x) {
			head = head.next;
			i++;
		}
		return head.data;
	}
	
	public static void bubble(Node<Integer> head) {
		for(int i = 0; i < length(head); i++ ) {
			for(int j = 0; j < length(head) - i - 1; j++) {
				
				if(getData(head, j) > getData(head, j+1))
				{
					Node<Integer> temp1 = get(head, j+1);
					Node<Integer> temp2 = get(head, j);
					int s = temp1.data;
					temp1.data = temp2.data;
					temp2.data = s;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter elements : ");
		Node <Integer> head = input();
		System.out.print("Entered list : ");
		print(head);
		System.out.print("\nAfter sorting : ");
		bubble(head);
		print(head);
	}
	
}
