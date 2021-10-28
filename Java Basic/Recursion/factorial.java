package Recursion;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		System.out.println(n+"! = "+fac(n));
	}
	
	public static int fac(int n)
	{
		if(n==1)
			return 1;
		int smallAns = fac(n-1);
		return (n*smallAns);
	}

}
