package Recursion_String;

import java.util.Scanner;

public class String_to_Integer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Integer string : ");
		String s = sc.next();
		
		System.out.println(print(s));
	}
	
// we can apply certain mathematical operation (+ , - , * , /) on "char" 
// but on "String" only ' + ' can be used to concatenate ( join )	
	
	public static int print (String s) {
		
		if(s.length() == 0)
			return 0;
		
		int x = s.charAt(0) - '0';
// 	    don't use only " s.charAt(0) " as it will only take the character value 
//  	but by " subtracting " it with zero (0) then it will be a integer only .
		
		int y = (int)(x * (Math.pow(10,s.length()-1)) + print(s.substring(1)));
//				as Math.pow returns a double value for that we have type casted it .
		
// 		"OR" you can also use x and y as double , then no need to typecast it .		
		
		return y;
	}
}