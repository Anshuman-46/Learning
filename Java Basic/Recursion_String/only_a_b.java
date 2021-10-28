package Recursion_String;

import java.util.Scanner;

public class only_a_b {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the String : ");
		String s = sc.next();
		
		 System.out.print("Is string contain only 'a' & 'b' : "+only_ab(s));
	  }
	  
	  public static boolean only_ab(String s)
	  {
		  if(s.equals(""))  // s.length == 1 might also work
			  return true;
		  
		  boolean ans = true;
		  
		  if(s.charAt(0) == 'a')
			  ans = only_ab(s.substring(1));
		  
		  else if (s.charAt(0) == 'b' && s.charAt(1) == 'b')
			  ans = only_ab(s.substring(2));
		  
		  else
			  ans = false;
		  
		  return ans;	  
	  }
}