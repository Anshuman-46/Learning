package BasicQuestion;
// not done
import java.util.Scanner;

public class MergeSorting {

	public static void print(Node<Integer>head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	
	public static Node<Integer> input(){
		Node<Integer>head= null,tail = null;
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
	
	public static int length(Node<Integer> head) {
		int i = 0;
		while(head != null) {
			head = head.next;
			i++;
		}
		return i;
	}
	
	public static Node <Integer> merging(Node <Integer>l1,Node <Integer>l2){
		if(l1.data > l2.data) {
			Node <Integer> tmp = l1;
			l1 = l2;
			l2 = tmp;
		}
		Node <Integer> res = l1;
		while(l1 != null && l2 != null) {
			Node <Integer> temp = null;
					
			while(l1 != null && l1.data <= l2.data) {
				temp = l1;
				l1 = l1.next;
			}
			temp.next = l2;
			
//			swap
			Node <Integer> tmp = l1;
			l1 = l2;
			l2 = tmp;
		}
		return res;
	}
	
	public static Node<Integer> mid(Node <Integer>head){
		
		Node<Integer> slow = head;
		Node<Integer> fast = slow.next;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	public static Node<Integer> MergeSort(Node<Integer> head){
	
		Node<Integer> current = head; 
		if(head == null || head.next == null)
			return head;
		
		Node<Integer> mid = mid(head);
		
//		part 1
		Node<Integer> part1 = MergeSort(head);
		
//		part 2
		Node<Integer> part2 = MergeSort(mid.next);
		mid.next = null;
		return merging(part1,part2);
	}
	
	public static void main(String [] args) {

		System.out.println("Enter list : ");
		Node<Integer>head = input();
		System.out.print("unsorted list : ");
		print(head);
		System.out.print("sorted list : ");
		Node<Integer> tmp = MergeSort(head);
		print(head);
	}
}