package Recurion_OptimizedArray;

import java.util.Scanner;

public class Intersection_Elements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of elements of first array : ");
		int n = sc.nextInt();
		
		System.out.println("Enter the array : ");
		int first [] = new int [n];
		
		for(int i =0;i<n;i++)
			first[i] = sc.nextInt();
		
		System.out.print("Enter number of elements of second array : ");
		int m = sc.nextInt();
		
		System.out.println("Enter the array : ");
		int second [] = new int [m];
		
		for(int i =0;i < m ; i++)
			second[i] = sc.nextInt();
		
		System.out.println("Intersection elements : ");
		intersection(first,second);
	}
	
	public static void intersection(int []first , int [] second)
	{
		intersection(first,second,0);
	}
	
	private static void intersection(int []first , int [] second,int index)
	{
		if(index == first.length)
			return;
		
		int i;
		for(i = 0 ; i < second.length ; i++)
		{
			if(first[index] == second[i])
				System.out.println(first[index]);
		}
		
		if(i == second.length)
			intersection(first,second,index+1);
	}
}
