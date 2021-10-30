import java.util.Stack;	// important

public class StackCollection {
	
	public static void main(String[] args) {
		
		Stack <Integer> stack = new Stack <> (); // important
		
		for(int i = 0; i < 5; i++)
			stack.push(i);
		
		while(! stack.isEmpty())
			System.out.println(stack.pop());	
	}	
}