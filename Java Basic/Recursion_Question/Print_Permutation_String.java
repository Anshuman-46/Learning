package Recursion_Question;

import java.util.Scanner;

public class Print_Permutation_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the string : ");
		String s = sc.next();
		
		System.out.println("Permutations of "+s+" : ");
		permute(s);
	}
	
	public static void permute (String s)
	{
		permute(s,0,s.length()-1);
	}
	
	private static void permute (String s , int l , int r)   // l = extreme_left , r = extreme_right
	{
		if(l == r)
			{
				System.out.println(s);
				return ;
			}
		
		for (int i = l ; i <= r ; i++)
		{
			s = swap (s,l,i);
			permute(s,l+1,r);
			s = swap (s,l,i);  // this is said to be Backtracking
		}
	}
	
	private static String swap (String s , int i,int j)
	{
		char [] c = s.toCharArray() ;
		
		char temp = c[i];
		c[i] = c[j];
		c[j] = temp;
		
		String swapped = new String (c);
		
		return swapped;
	}
}