package Array_Application;

import java.util.Scanner;

public class sort_0_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no. of time to enter the array");
		int x=sc.nextInt();
		for(int i=1;i<=x;i++)
		{	System.out.println("Enter number of element");
			int n=sc.nextInt();
			int ar[]=new int[n];
			ar=input(n);
			System.out.println("The sorted array as 0[L] & 1 [R]");
			sort(ar);
		}
	}
	
	public static int [] input(int n)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array");
		int arr[]=new int [n];
		for(int i=0;i<n;i++)
		   arr[i]=sc.nextInt();	
		return arr;
	}
	
		public static void sort (int [] arr)
		{
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==0)
					System.out.print(arr[i]+" ");
			}
			
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==1)
					System.out.print(arr[i]+" ");
			}
		}
}

