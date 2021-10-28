package Recursion_Question;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of stairs : ");
		int n = sc.nextInt();
		
		System.out.print("The number of possible ways are : "+ways(n));
	}

	public static int ways (int n)
	{
		if(n == 1 || n == 0)
			return 1;
		
		if(n == 2)
			return 2;

// 		it is optional		
//		if(n == 3)
//			return 4;
		
		return ways(n - 1) + ways(n - 2) + ways(n - 3);
	}
	
}
