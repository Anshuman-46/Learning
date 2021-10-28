package Recurion_OptimizedArray;

import java.util.Scanner;

public class Unique_Element {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number of elements of array : ");
		int n = sc.nextInt();
		
		System.out.println("Enter the array : ");
		int arr [] = new int[n];
		
		for(int i = 0 ; i < arr.length ; i++)
			arr[i] = sc.nextInt();
		
		System.out.print("Unique element : "+unique(arr));
	}
	
	public static int unique(int [] arr)
	{
		return unique(arr,0);
	}
	
	private static int unique (int [] a , int index)
	{
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[index] == a[i] && i != index)
				return unique(a,index+1);
		}
		
		return a[index];
	}
}
