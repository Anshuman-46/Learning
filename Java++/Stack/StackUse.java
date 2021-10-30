
public class StackUse {

	public static void main(String[] args) throws StackFullException /* seen on console */{
		
		StackUsingArray stack = new StackUsingArray();
//		stack.top = 100 can't access
		
		for(int i = 1; i <= 20; i++) {
			stack.push(i); // throws StackFullException
//			as it might put element at out of capacity
		}
		stack.push(92234);
		while(!stack.isEmpty()) {
//			i know  that i will not go inside the exception
			try {
				System.out.println(stack.pop());
			} catch (StackEmptyException e) {
				// Never reach ever
			}
		}
		
	}

}
