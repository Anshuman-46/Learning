	package BasicQuestion;

import java.util.Scanner;

public class MidList {

	public static void print(Node <Integer> head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	
	public static Node<Integer> input(){
		Node<Integer> head = null,tail = null;
		
		Scanner sc = new Scanner (System.in);
		int data = sc.nextInt();
		while(data != -1 ) {
			Node <Integer> newNode = new Node(data);
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
	
	public static int length(Node <Integer> head) {
		int i = 1;
		while(head != null) {
			head = head.next;
			i++;
		}
		return i;
	}
//  non-optimized approach
	public static int mid(Node<Integer>head) {
		
		int length = (length(head) % 2 == 0) ? (length(head) - 1)/2 : length(head)/2;
		int i = 1;
		while(i <= length) {
			i++;
			head = head.next;
		}
		return head.data;
	}
	
	public static void main(String [] args) {
		
//		one way of finding mid element : do length/2 and return that index element
//		other way is to get the mid index and use get(head,index) to get that element
		
//		but one of optimized way is : 
		System.out.println("Enter elements : ");
		Node <Integer> head = input();
		System.out.print("Elements are : ");
		print(head);
		Node<Integer> ans = midOpt(head);
		System.out.println("\nMid element : "+ans.data);
		
	}
	
//  odd number of elements and even with (2nd last mid) : this approach is best
	public static Node<Integer> midOpt(Node<Integer>head){
		Node <Integer> slow = head;
		Node <Integer> fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
//	odd and even (1st mid)
	public static Node<Integer> midnew(Node<Integer> head){
		Node<Integer> slow = head;
		Node<Integer> fast = slow.next;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}return slow;
	}
}