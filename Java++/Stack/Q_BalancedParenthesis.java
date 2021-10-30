import java.util.Scanner;
import java.util.Stack;
public class Q_BalancedParenthesis {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the expression :");
		String s = sc.next();
		System.out.println(s+" = "+balanced(s));
	}	
	
	public static boolean balanced(String s) {
		
		char c1 = '(', c2 = ')', c3 = '{', c4 = '}', c5 = '[', c6 = ']';

		Stack <Character> stack = new Stack <> ();
		
		for(int i = 0; i < s.length(); i++) {
			
			if ((s.charAt(i) == c2 || s.charAt(i) == c4 ||s.charAt(i) == c6 ) && stack.size() == 0)
				return false;
			
			if(s.charAt(i) == c1 || s.charAt(i) == c3 ||s.charAt(i) == c5) // opening 
				stack.push(s.charAt(i));
			
			else if (s.charAt(i) == c2) {
				if(stack.peek() == c1)
					stack.pop();
				else
					return false;
			}
			
			else if (s.charAt(i) == c4) {
				if(stack.peek() == c3)
					stack.pop();
				else
					return false;
			}
			
			else if (s.charAt(i) == c6) {
				if(stack.peek() == c5)
					stack.pop();
				else
					return false;
			}
			else
				continue;
		}
		if(stack.size() > 0)
			return false;
		else
			return true;
	}
}