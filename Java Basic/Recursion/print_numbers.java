package Recursion;

import java.util.Scanner;

public class print_numbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		print(1,n);
	}
	
	public static int print(int i,int n)
	{
		if(i<=n)
			{
			   System.out.print(i+" ");
				  print (++i,n);
			}
		return 0;
	}
}
