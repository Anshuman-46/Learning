package temp;

public class ExampleUse {

	public static void print(Example <Integer> head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head  = head.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

		Example <Integer> e1 = new Example <> (12);
		Example <Integer> e2 = new Example <>(21);
		Example <Integer> e3 = new Example <> (45);
		
		e1.next = e2;
		e2.next = e3;
		
		Example <Integer> head = e1;
		
		print(e1);
		
	}

}
