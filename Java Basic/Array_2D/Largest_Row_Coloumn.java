package Array_2D;

import java.util.Scanner;

public class Largest_Row_Coloumn {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no. of times to enter array 2D");
		int t=sc.nextInt();
		
		System.out.println("Enter rows of array 2D");
		int r=sc.nextInt();
		
		System.out.println("Enter cols of array 2D");
		int c=sc.nextInt();

		for(int i=1;i<=t;i++)
		{
			int arr [] [] = input(r,c);
			print(arr);
					// can be assigned to any variables also				
			large_r_c(row_largest_sum(arr),col_largest_sum(arr));
		}
	}

	
	public static int [] [] input(int r,int c)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter array 2D");
		int arr [][]= new int [r][c];
		for(int j=0;j<r;j++)
		{
			for(int k=0;k<c;k++)
				arr[j][k]=sc.nextInt();
		}
		
		return arr;
	}
	
	public static void print(int [][]arr) {
		System.out.println("The array is : ");
		for(int j=0;j<arr.length;j++)
		{
			for(int k=0;k<arr[0].length;k++)
				System.out.print(arr[j][k]+" ");
			
			System.out.println();
		}	
	}
	
	public static int row_largest_sum(int [] [] arr)
	{
		int large=Integer.MIN_VALUE;
		for(int row=0;row<arr.length;row++)
		{
			int sum=0;
			for(int col=0;col<arr[0].length;col++)
				sum=sum+arr[row][col];
			
			if(large<sum)
				large=sum;
		}	
		return large;
	}
	
	public static int col_largest_sum(int [] [] arr)
	{
		int large=Integer.MIN_VALUE;
		for(int col=0;col<arr[0].length;col++)
		{
			int sum=0;
			for(int row=0;row<arr.length;row++)
				sum=sum+arr[row][col];
			
			if(large<sum)
				large=sum;
		}	
		return large;
	}
	
	public static void large_r_c(int l1,int l2)
	{
		if(l1>l2)
			System.out.print("Largest sum of coloumn is :"+l1+"\n");
		else
			System.out.print("Largest sum of row is :"+l2+"\n");
	}
}
