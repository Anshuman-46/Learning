package Recursion_String;

import java.util.Scanner;

public class Remove_duplicates_consecutive {

	public static void main(String[] args) {
	Scanner sc  = new Scanner (System.in);
	
	System.out.print("Enter the string : ");
	String s =sc.next();
	
	System.out.println("After removing duplicates : "+remove_duplicate(s));
}
	
// DRY RUN IS THE KEY TO ANY ALGORITHM	

	public static String remove_duplicate(String s) {
		
	if(s.equals("") || s.length() == 1)  // s.equals("") => when the element is last and then string is passed then it will definately help
										//  s.length == 1 => because if it is duplicate then it wouldn't be passed
		return s;
	
	if(s.charAt(0) == s.charAt(1))
		return remove_duplicate(s.substring(1));
	
	else
		return s.charAt(0) + remove_duplicate(s.substring(1));
	}
}