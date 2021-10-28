package Array_Application;

import java.util.Scanner;				// WELL DONE

public class sort_0_1_2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no. of time to enter the array");
		int x=sc.nextInt();
		for(int i=1;i<=x;i++)
		{	System.out.println("Enter number of element");
			int n=sc.nextInt();
			int ar[]=new int[n];
			ar=input(n);
			for(int j=0;j<=2;j++)				// SORT ANY ELEMENT JUST BY CHANGING 2 => THAT NUMBER			{
				Z_O_T(ar,j);
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
		
		public static void Z_O_T (int arr[],int a)
		{
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==a)
					System.out.print(arr[i]+" ");
			}
		}
}
