package Recurion_OptimizedArray;

import java.util.Scanner;

public class Duplicate_Element {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		System.out.print("Enter the number of elements of array : ");
		int n = sc.nextInt();
				
		System.out.println("Enter the array : ");
		int arr [] = new int [n];
		
		for(int i = 0 ;i < arr.length ;i++)
			arr[i] = sc.nextInt();
		
		System.out.println("Duplicate element : "+duplicate(arr));
	}
	
	public static int duplicate (int [] arr)
	{
		return duplicate(arr,0);
	}
	
	private static int duplicate(int [] a,int index)
	{
		for (int i = 0;i < a.length;i++)
		{
			if(i == index)
				continue;
			
			if(a[index] == a[i] && i != index)
				break;
			
			 if (a[i] != a[index] && i == a.length - 1)
				return duplicate(a,index+1);
		}
		return a[index];
	}
}