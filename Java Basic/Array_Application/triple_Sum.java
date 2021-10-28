package Array_Application;

import java.util.Scanner;

public class triple_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no. of time to enter the array");
		int x=sc.nextInt();
		int result;
		for(int i=1;i<=x;i++)
		{	System.out.println("Enter number of element");
			int n=sc.nextInt();
			int ar[]=new int[n];
			ar=input(n);
			
			System.out.println("Enter the number to find the sum");
			int a=sc.nextInt();
			result = psum(ar,a);
			System.out.println("Total no. of pairs(including (a,b) & (b,a)) is "+result);
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

	public static int psum(int []a,int n)
	{	
		int count = 0;
		for(int i=0;i<a.length;i++)
		{	
			 for(int j=0;j<a.length;j++)
			{
				for(int k=0;k<a.length;k++)
					if(n==a[i]+a[j]+a[k])
					{
						count +=1;
						break;
					}
			}
		}
		return count;
	}
}
