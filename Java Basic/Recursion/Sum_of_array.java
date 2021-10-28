package Recursion;

import java.util.Scanner;

public class Sum_of_array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("No. of times to use : ");
		int t = sc.nextInt();
		
		int i=1;
		while(i<=t)
		{
			System.out.print("No. of element of array : ");
			int n = sc.nextInt();
			
			int arr [] = new int [n];
			System.out.println("Enter the element of array");
			
			for(int j=0;j<n;j++)
				arr[j] = sc.nextInt();
			
			System.out.println("sum is : "+sumBetter(arr,0));		// two approaches = 1 + 1(Better)
			
			i++;
		}	
	}
	
	public static int sum (int [] a) {
		
		if(a.length == 1)
			return a[0];
		
		int [] check  = new int [a.length-1];
		
		for(int i=0;i<check.length;i++)
			check[i] = a[i+1];
		
		int add = a[0];
		
		add = add + sum(check);
		return add;
	}
	
//  the user should not know which logic we are using so they INPUT the ARRAY and get the ANSWER 
	public static int sumBetter (int []a)
	{
		return sumBetter(a,0);
	}
	
	
//  private i.e., only for developer	
//  name can be same as they are PUBLIC and PRIVATE

	
	private static int sumBetter (int [] a , int startIndex )
	{
//		if(startIndex == a.length - 1)
//			return a[startIndex];
//		
//		int add = a[startIndex];
//		add = add + sumBetter(a,startIndex + 1);
//		
//		return add;
	
// both approaches are good 		
		
		if(startIndex == a.length -1)
			return a[startIndex];

			int sum = 0;			// do this if you want to have the result if the previous_called_function
								    // so add_the_function with the term whose value you want
			sum = sum + a[startIndex] + sumBetter(a,startIndex+1);
			return sum;
	}
}