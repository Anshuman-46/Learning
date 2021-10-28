package String;
import java.util.Scanner;
public class Remove_repeated_words {
	
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String s=sc.nextLine();
		remove_repetition(s);
		
	}
	
	public static void remove_repetition(String s) 
	{

		char c = '@';
		for(int i=0;i<s.length();i++)
		{
			if(i==0 || c!=s.charAt(i))
			{
				System.out.print(s.charAt(i)+"");
				c=s.charAt(i);
			}
		}
	}
}
