package Array_Application;

import java.util.Scanner;

public class sum_two_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no. of time to enter the array");
		int x=sc.nextInt();
		for(int i=1;i<=x;i++)
		{	System.out.println("Enter number of element for A1");
			int n=sc.nextInt();
			int a1[]=new int[n];
			a1=input(n);
			
			System.out.println("Enter number of element for A2");
			int m=sc.nextInt();
			int a2[]=new int[m];
			a2=input(m);
			sum2A(a1,a2);
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
	
	public static void sum2A (int []a,int []b)
	{
		int n;
		if(a.length<b.length)
			n=a.length;
		else
			n=b.length;
		int c[]=new int[n];
		
		for(int i=0;i<n;i++)
			c[i]=a[i]+b[i];
		output(c);
	}
	
	public static void output(int c [])
	{
		for(int i=0;i<c.length;i++)
			System.out.print(c[i]+" ");
	}
}

