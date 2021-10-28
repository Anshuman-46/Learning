package Searching_Sorting;

import java.util.Scanner;

public class Bubble_Sorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no. of element of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		a=input(n);
		System.out.println("The sorted array");
		int b[]=new int[n];
		b=bubble(a);
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
	
	public static int [] bubble (int []a)
	{			// "n-1" <= mistake
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		return a;
	}
	
	public static void output (int []a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}
