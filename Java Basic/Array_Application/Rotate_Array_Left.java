package Array_Application;

import java.util.Scanner;

public class Rotate_Array_Left {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no. of time to enter the array");
		int x=sc.nextInt();
		for(int i=1;i<=x;i++)
		{	System.out.println("Enter number of element");
			int n=sc.nextInt();
			int ar[]=new int[n];
			ar=input(n);
			System.out.println("Enter no. of element to leave first");
			int y=sc.nextInt();
			left(ar,y);
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
		
		public static void left(int []arr,int y)
		{
			for(int i=y;i<arr.length;i++)
			   System.out.print(arr[i]+" ");
			
			for(int i=0;i<y;i++)
				   System.out.print(arr[i]+" ");
		}
}
