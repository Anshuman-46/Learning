package Recursion;

import java.util.Scanner;

public class Last_Index_Search {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements of array : ");
		int n = sc.nextInt();
		
		System.out.println("Enter the array :");
		int arr[] = new int [n];
		
		for(int i=0;i<arr.length;i++)
			arr[i] = sc.nextInt();
		
		System.out.print("Enter the element to search : ");
		int x = sc.nextInt();
		
		System.out.println("Element is at "+lastIndex(arr,x)+" last index");
	}
	
	public static int lastIndex(int []a,int x)
	{
		return lastIndex(a,a.length - 1,x);
	}

	private static int lastIndex(int []a,int startIndex,int x)
	{
		if(startIndex == 0 )
			return -1;
		
//		OR we can use this also 
//		if(startIndex == a.length - 1 && x != a.length - 1)
//			return -1;
		
		if(x==a[startIndex])
			return startIndex;
		
		else
			return lastIndex(a,startIndex - 1 ,x);
	}
	
}
