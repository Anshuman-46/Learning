package Recursion;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the STRING for palindrome : ");
		String s = sc.nextLine();

		System.out.println(stringPalindrome_Better(s));
		
	}

	public static boolean stringPalindrome(String s) {
		return stringPalindrome(s,s.length(),0);
	}
	
	private static boolean stringPalindrome(String s,int n , int i) {
		
		if(s.length() % 2 != 0)
			return false;
		
		if(n==0 )
		 return true;
		
		boolean h = false;
		
		if(i<=n/2)
		{
			if(s.charAt(i) != s.charAt(n-1) )
			{
				return h;
			}
			
			else
			{
				h = true;
				stringPalindrome(s,--n,++i);
			}
		}
		return h;
	}

	public static boolean stringPalindrome_Better(String s) {
		
		if(s.length() % 2 != 0)
			return false;
		
		if(s.length() == 0)
			return true;
		
		if(s.charAt(0) == s.charAt( s.length() - 1))
			return stringPalindrome_Better(s.substring(1 , s.length() - 1));
		
		return false;
	}
}