package Recursion_String;

import java.util.Scanner;

public class Replace_Character {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the string : ");
		String s = sc.next();
		
		sc.nextLine();
		
		System.out.print("Enter the input character : ");
		char input = sc.nextLine().charAt(0);
		
		System.out.print("Enter the output character : ");
		char output = sc.nextLine().charAt(0);
		
		System.out.println("Updated string : "+replace_char(s,input,output));
	}
	
	public static String replace_char(String s , char input , char output)
	{
		if(s.equals(""))
			return s;
		
		if(s.charAt(0) == input)
			return output + replace_char(s.substring(1), input, output);
		
		else
			return s.charAt(0) + replace_char(s.substring(1),input,output);
	}
}