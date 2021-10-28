package Recursion;

import java.util.Scanner;

public class Geometric_Sum {

// 1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enetr the number : ");
		int k = sc.nextInt();
		
		System.out.println("Geometric sum : "+geoSum(k));
	}

	public static double geoSum (int n)
	{
		return geoSum(n,0);
	}
	
	private static double geoSum (int n , int i)
	{
		double sum = 0;

		if(i<=n)
		{
			sum = sum + 1/Math.pow(2, i) + geoSum(n,++i);
		}
		
		return sum;
	}
}