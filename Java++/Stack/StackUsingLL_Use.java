public class StackUsingLL_Use {

	public static void main(String [] args) {
	
		StackUsingLL <Integer> stack = new StackUsingLL <> ();
		
		for(int i = 1; i <= 2; i++)
			stack.push(i);
		
		stack.push(123);
		
		while(! stack.isEmpty()) {
			try {
				System.out.println(stack.pop());
			}catch(StackEmptyException e) {
//				code not reachable
			}
		}
		
		stack.push(3682);
//		just to check
		try {
		System.out.println(stack.top()+" size :"+stack.size());
		}catch(StackEmptyException e) {
//			code not reachable
		}
		
		
	}
}