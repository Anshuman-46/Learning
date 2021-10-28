package Searching_Sorting;

import java.util.Scanner;

public class Binary_Search {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the no. of element of array");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		a = input(n);
		
		System.out.println("Enter the no. to be searched");
		int x = sc.nextInt();
		
		System.out.println("Element at "+binary(a,x)+" index");
		
	}
	public static int [] input(int n)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array");
		int arr[] = new int [n];
		
		for(int i = 0 ; i < n ; i++)
			arr[i] = sc.nextInt();	
		
		return arr;
	}
	
	public static int binary (int []a,int x)
	{
		int start,end;
		
		start = 0;
		end = a.length;
		
		while(start < end)
		{
			int mid = (start + end) / 2;

				if(x > a[mid])
					start = mid + 1;
				
				else if(x < a[mid])
					end = mid - 1;
				
				else
					return mid;
		}
		return -1;			
	}
}