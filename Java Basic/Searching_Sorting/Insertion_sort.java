package Searching_Sorting;

import java.util.Scanner;

public class Insertion_sort {

	public static void main(String[] args) {

		Scanner sc =  new Scanner (System.in);
		
		System.out.println("Enter no. of element of array");
		int n = sc.nextInt();
		
		int a [] = input(n);
		insertion(a);
	}
	
	public static int [] input (int n)
	{
		Scanner sc = new Scanner (System.in);
				
		int a [] = new int[n];
		
		System.out.println("Enter the array");
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		
		System.out.println("Array before sorting");
		output(a);
		
		return a;
	}

	public static void output (int []a)
	{
		for(int i = 0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
	
	public static void insertion(int a[])
	{
		for(int i=1;i<a.length;i++)
		{
			int j=i-1, t = a[i];
			while(j>=0 && a[j]>t)
			{	 
				a[j+1] = a[j];
				j--; 
			}
			    a[j+1] = t;
		}
		
		System.out.println("\nArray after sorting");
		output(a);	
	}
}
