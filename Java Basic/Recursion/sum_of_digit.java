package Recursion;

import java.util.Scanner;

public class sum_of_digit {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		System.out.println("Sum of digit of "+n+" : "+sumDigit(n));
	}

	public static int sumDigit(int n) {
		if(n == 0)
			return n;

			int sum = 0;
			sum = sum + (n % 10) + sumDigit(n/10);

			return sum;
	}
	
}
