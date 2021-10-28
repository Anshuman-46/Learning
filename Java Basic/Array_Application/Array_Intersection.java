package Array_Application;

import java.util.Scanner;

public class Array_Intersection {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no. of time to enter the array");
		int x=sc.nextInt();
		for(int i=1;i<=x;i++)
		{	System.out.println("Enter number of element");
			int n1=sc.nextInt();
			int a[]=new int[n1];
			a=input(n1);
			
			System.out.println("Enter number of element");
			int n2=sc.nextInt();
			int b[]=new int[n2];
			b=input(n2);
			find(a,b);
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
	
// THE INTERSECTION OF TWO ARRAY
	
	public static void find(int []a,int []b)
	{	
		int f;
		for(int i=0;i<a.length;i++)
		{
			f=a[i];
			for(int j=0;j<b.length;j++)
			{
				if(f==b[j])
				{
					System.out.print(f+" ");
					break;
				}
				else
					continue;
			}
		}
	}
}
