package BQ;
import java.util.Stack;
public class ReverseStack {

	public static void main(String[] args) {
		
		Stack <Integer> s = new Stack <> ();
		
		for(int i = 1; i <= 4; i++)
			s.push(i);
		
		System.out.println(s);
		reverse(s);
		System.out.println(s);
	}
	
	public static void reverse(Stack <Integer>s) {
		if(s.size() > 0) {
			
			int x = s.pop(); // peek then pop 
			reverse(s);
			insert_at_bottom(s,x);
		}
	}
	
	 private static void insert_at_bottom(Stack <Integer>s,int x) {
		
		if(s.isEmpty())
			s.push(x);
		
		else {
			
			int a = s.pop();
			
			insert_at_bottom(s,x);
			s.push(a);
		}
		
	}
}