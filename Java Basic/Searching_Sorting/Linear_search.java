package Searching_Sorting;

import java.util.Scanner;

public class Linear_search {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the no. of element of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		a=input(n);
		System.out.println("Enter the no. to be searched");
		int x=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(x==a[i])
			{
				System.out.println("No. is at "+i+"index");
				break;
			}
		}
	}
	
	public static int [] input(int n)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array");
		int arr[]=new int [n];
		for(int i=0;i<n;i++)
		{
			
			arr[i]=sc.nextInt();
		}	
		return arr;
	}
}
