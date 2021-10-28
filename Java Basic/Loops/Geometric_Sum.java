package Loops;

import java.util.Scanner;

public class Geometric_Sum {
	
	// 1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 	

	public static void main ( String []args){
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		double sum = 0;
				
		for(int i=0;i<=n;i++)
			sum = sum + 1/Math.pow(2, i);
			
		System.out.println("sum : "+sum);
	}
}
