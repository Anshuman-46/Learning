package Searching_Sorting;

import java.util.Scanner;

public class selection_sorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no. of element of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		a=input(n);
		System.out.println("The sorted array");
		
		int b[]=new int[n];
		b=selection(a);
		output(b);
		
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
	
	public static int[]selection(int []a)
	{
		
		for(int i=0;i<a.length-1;i++)
		{
			int min=a[i];
			int minI=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(min>a[j])
				{
					min=a[j];
					minI=j;
				}
			}
		 a[minI]=a[i];
		 a[i]=min;
		}
		return a;
	}
	
	public static void output (int []a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}
