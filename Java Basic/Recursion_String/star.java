package Recursion_String;

import java.util.Scanner;

public class star {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the STRING : ");
		
		String str = sc.next();
		
		System.out.println("After observation : "+star_Better(str));
	}

	public static String star_Better(String s)
	{
		if(s.length() == 1)
			return s;
		
		if(s.charAt(0) == s.charAt(1))
			return s.charAt(0) + "*" + star(s.substring(1));
		
		else
			return s.charAt(0) + star(s.substring(1));
	}
	
	public static String star(String s)
	{
		if(s.length() == 1)
			return s;
		// return s.substring(0);
		
		String temp = s.substring(0,1);
		
		if(s.charAt(0) == s.charAt(1))
			temp = temp + "*";
			
			return temp + star(s.substring(1));
	}
}