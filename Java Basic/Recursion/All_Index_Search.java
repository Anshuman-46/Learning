package Recursion;

import java.util.Scanner;

public class All_Index_Search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements of array : ");
		int n = sc.nextInt();
		
		System.out.println("Enter the array :");
		int arr[] = new int [n];
		
		for(int i=0;i<n;i++)				// GOOD QUESTION
			arr[i] = sc.nextInt();
		
		System.out.print("Enter the element to search : ");
		int x = sc.nextInt();
		
		int temp [] = allIndex(arr,x);
		
		for (int i=0;i<temp.length;i++)
		{
			if( temp[i] >= 0 )
			System.out.print(temp[i]+" ");
		}
	}
	
	public static int [] allIndex(int []a,int x)
	{
		int temp [] = new int [a.length];
		temp[0] = -1;
 		return allIndex(a,0,x,temp);
	}
	
	private static int [] allIndex (int [] a , int startIndex , int x , int [] t)
	{
		if( startIndex == a.length )
			return t;
		
		if( x == a[startIndex] )
			t [startIndex] = startIndex;
		
		if (startIndex == a.length - 1 && x != a[startIndex])
		return t;
		
		else
			return allIndex(a,startIndex+1,x,t);
		
		}

}
