package Recursion_Question;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(isPalindrome(n));
	}
	
	public static boolean isPalindrome(int x) {
		
		int temp = x;
		int reverse = rev(x,0);
		
		if(reverse == temp)
			return true;
		
		else
			return false;
    }
	
	private static int rev(int n,int temp)
	{
		if(n == 0)
			return temp;
		
		temp = temp*10 + (n % 10);
		
		return rev(n/10,temp);
	}	
}	