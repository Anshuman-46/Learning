package Recursion_String;

import java.util.Scanner;

public class Replace_pi {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the string : ");
		String s = sc.next();
		
		System.out.println("After replacement : "+replace_pi(s));
	}

	public static String replace_pi(String s)
	{
		if(s.length() == 1 || s.equals(""))
			return s;
		
		if(s.charAt(0) == 'p' && s.charAt(1) == 'i')
			return "3.14" + replace_pi(s.substring(2));
		
		else
		return s.charAt(0) + replace_pi(s.substring(1));
	}
	
}
