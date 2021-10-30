package BasicQuestion;

import java.util.Scanner;

public class MergeSortedLinkList {
	

	public static void print(Node<Integer> head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	
	public static Node<Integer> input(){
		Node<Integer> head = null, tail = null;
		
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		
		while(data != -1) {
			Node<Integer> newNode = new Node(data);
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
	
	public static Node<Integer> mergelist(Node<Integer> l1,Node<Integer> l2){
		
//		if(l1 == null)
//			return l2; // case when user enter null 
//		
//		if(l2 == null)
//			return l1;
		
		if(l1.data > l2.data) {  // for initial purpose only
			Node <Integer> temp = l1; // swapping 
			l1 = l2; // small = l1, large = l2;
			l2 = temp;
		}
		
		Node <Integer> result = l1;
		
		while(l1 != null && l2 != null) {
		
			Node<Integer> temp = null;
			while(l1 != null && l1.data <= l2.data) {
				temp = l1;
				l1 = l1.next;
			}
			temp.next = l2;
			
			// swap
//			if(l1 != null) { // if condition can also be applicable
			Node <Integer> s = l1;
			l1 = l2;
			l2 = s;}
//		}
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the first list : ");
		Node<Integer> head1 = input();
//		System.out.println();
		print(head1);
		
		System.out.println("\nEnter the second list : ");
		Node<Integer> head2 = input();
//		System.out.println();
		print(head2);
		
		System.out.println("\nMerged list : ");
		Node <Integer> ans = merge(head1,head2);
		print(ans);
	}
	
	
	public static Node<Integer> merge(Node<Integer>l1,Node<Integer>l2){
		
		if(l1.data > l2.data) { // if l1 > l2 (first element : head)
			Node<Integer>temp = l1;		// then swap
			l1 = l2;				// we just want lower element in l1 :)
			l2 = l1;
		}
		Node<Integer>res = l1;
		
		while(l1 != null && l2 != null) {
			Node<Integer>temp = null;
			while(l1 != null && l1.data <= l2.data) {
				temp = l1;
				l1 = l1.next;
			}
			temp.next = l2;
			// swap
			Node<Integer>s = l1;
			l1 = l2;
			l2 = s;
		}
		return res;
	}

}
