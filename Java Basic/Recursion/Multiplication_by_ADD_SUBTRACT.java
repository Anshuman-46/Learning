package Recursion;

import java.util.Scanner;

public class Multiplication_by_ADD_SUBTRACT {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		int n = sc.nextInt();
		
		System.out.print("Enter second number : ");
		int m = sc.nextInt();
		
		System.out.println("Multiplication of "+n+" * "+m+" : "+mul_A_S(n,m));
	}

	public static int mul_A_S (int n, int m)
	{
		int i = 1,mul=0;
		return mul_A_S(n,m,i,mul);
	}
	
	private static int mul_A_S (int n,int m,int i,int mul)
	{
		if(i<=m)
		{
			mul = mul + n;
			return mul_A_S(n,m,++i,mul);
		}
		
		return mul;
		
	}
}
