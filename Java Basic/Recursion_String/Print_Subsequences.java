package Recursion_String;

import java.util.Scanner;

public class Print_Subsequences {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the string : ");
		String s = sc.next();

// 		number of subsequence = 2 ^ n  (n is no. of elements of string entered)		
		
		System.out.println("The subsequences are : ");		
//		not used any type of array and even not returning anything
		subsequence(s);
		
//		using another array and returning it  		
		System.out.println("The subsequences using return are : ");
		
		String ans[] = return_subsequence(s);
		for(int i = 0;i<ans.length ;i++)
			System.out.print(ans[i]+" ");
	}
	
	public static void subsequence(String s)
	{
		subsequence(s,"");
	}
	
	private static void subsequence(String s , String print)
	{
		if(s.length() == 0)
		{
			System.out.println(print);
			return;
		}
		
//		not including first character
		subsequence(s.substring(1),print);
		
//		first character is included
		subsequence(s.substring(1),print + s.charAt(0));
	}
	
	public static String [] return_subsequence(String s)
	{
		if(s.length() == 0)
		{
			String ans [] = {""};
			return ans;
		}
		
		String [] smallAns = return_subsequence(s.substring(1));
		
		String [] ans = new String [2 * smallAns.length];
		
		for(int i = 0;i < smallAns.length;i++)
			ans[i] = smallAns[i];
		
		for(int i = 0 ; i < smallAns.length ; i++)
			ans[i + smallAns.length] = s.charAt(0) + smallAns[i];
		
		return ans;
	}
}