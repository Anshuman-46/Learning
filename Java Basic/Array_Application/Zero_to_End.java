package Array_Application;

import java.util.Scanner;

public class Zero_to_End {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no. of time to enter the array");
		int x=sc.nextInt();
		for(int i=1;i<=x;i++)
		{	System.out.println("Enter number of element");
			int n=sc.nextInt();
			int ar[]=new int[n];
			ar=input(n);
			zero_end(ar);
		}
	}
	
	public static int [] input(int n)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the array");
		int arr[]=new int [n];
		for(int i=0;i<n;i++)
		   arr[i]=sc.nextInt();	
		return arr;
	}
	
	public static void zero_end(int []a)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
				System.out.print(a[i]+" ");
			else
				continue;
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
				System.out.print(a[i]+" ");
			else
				continue;
		}
	}
}
