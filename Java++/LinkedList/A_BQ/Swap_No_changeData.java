package A_BQ;

import java.util.Scanner;

public class Swap_No_changeData {
	
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
	
	public static void swapNodata(Node<Integer> head, int x, int y) {
		
		Node <Integer> currX = head, currY = head;
		Node <Integer> prevX = null, prevY = null;
		
		int i = 0;
		while(i < x) {
			prevX = currX;
			currX = currX.next;
			i++;
		}
		
		i = 0;
		while(i < y) {
			prevY = currY;
			currY = currY.next;
			i++;
		}
		
		// If either x or y is not present, nothing to do
        if (currX == null || currY == null)
            return;
 
        // If x is not head of linked list
        if (prevX != null)
            prevX.next = currY;
        else // make y the new head
            head = currY;
 
        // If y is not head of linked list
        if (prevY != null)
            prevY.next = currX;
        else // make x the new head
            head = currX;
 
        // Swap next pointers
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter elements : ");
		Node <Integer> head = input();
		System.out.print("Entered list : ");
		print(head);
		
		Scanner sc = new Scanner (System.in);
		System.out.println("\nEnter indexes to be swapped : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		swapNodata(head,x,y);
		System.out.print("After swapping : ");
		print(head);
	}
}
