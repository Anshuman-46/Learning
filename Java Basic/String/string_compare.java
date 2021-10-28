package String;

import java.util.Scanner;

public class string_compare {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the two string");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int f=0;
		boolean result=false;
		if(s1.length()==s2.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				for(int j=0;j<s2.length();j++)
				{
					if(s1.charAt(i)==s2.charAt(j))  // j=0,1,2,3...
					{
						f=f+1;
						break;
					}
					else 
						continue;
				}
			}
			
			if(s1.length()==f)
				result = true;
			else
				result = false;
			
			System.out.println(result);
		}
		
		else
			System.out.println(result);
			
	}

}
