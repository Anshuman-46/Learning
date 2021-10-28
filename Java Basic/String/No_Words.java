package String;

import java.util.Scanner;

public class No_Words {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string including spaces");
		String str= sc.nextLine();           // HELLO EVERYONE  
		int count =0;
		for(int i=1;i<str.length();i++) 
		{
			if(str.charAt(i)==' ')
			{
				count+=1;
			}
		}
		System.out.println(count);			// = 2				

	}

}
