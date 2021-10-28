package Recursion;

import java.util.Scanner;

public class No_of_Zeroes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		System.out.println("No. of zeroes : "+zeroes(n));
	}
	
//   two approaches : 	
	
	public static int zeroes (int n) {
		
		int count = 0;
		
		if(n/10 == 0)
			return count;
				
		if(n % 10 == 0)
			count += 1;
		
		count = count + zeroes(n/10);
		
		return count;
	}
	
	public static int zeroes_other( int n) {

		if(n==0)
			return 0;
		
		int count = 0;
		
		if(n%10 == 0)
			return (count + 1 + zeroes_other(n/10));
		
		else
			return (count + zeroes_other(n/10));
	}
}
