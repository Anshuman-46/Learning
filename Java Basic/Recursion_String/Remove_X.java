package Recursion_String;

import java.util.Scanner;

public class Remove_X {

		public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter the string : ");
		String s = sc.next();
		
		System.out.print("After removing 'x' : ");
		System.out.println(remove_x_co(s));
	
	}
		public static String remove_x(String s)
		{
			if(s.equals(""))  // base case ;
				return s;	 // when the length is zero , no need to process anything
			
			if(s.charAt(0)=='x')
			return remove_x(s.substring(1));   
			
			else
			return s.charAt(0) + remove_x(s.substring(1));
		}
		
		public static String remove_x_co(String s)
		{
			if(s.length()==0)
				return s;
			
			String ans = "";
			
			if(s.charAt(0) != 'x')
				ans = ans + s.charAt(0);
			
			String smallAns = remove_x_co(s.substring(1));
			
			return ans + smallAns;
		}
}
