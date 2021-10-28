package Recursion_Question;

import java.util.Scanner;

public class Print_SubSets {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the number of element of array : ");
		int n = sc.nextInt();
		
		System.out.println("Enter the array : ");
		int arr [] = new int [n];
		
		for(int i = 0 ;i <arr.length ;i++)
			arr[i] = sc.nextInt();
		
		System.out.println("Enter the number for subset : ");
		int x = sc.nextInt();
		
		System.out.println("The subsets are : ");
		print_subset(arr,x);
	}
	
	public static void print_subset (int [] arr,int x)
	{
		print_subset (arr,x,0);
	}
	
	private static void print_subset (int [] a, int x , int i)
	{
		int j = i + 1;
		
		if ((i == a.length - 1 ) || (a[i] >= x && i == a.length - 1) ) 
			return ;
		
		if ( a[i] >= x )
			print_subset(a,x,i + 1) ;
		
		while (j <= a.length - 1)
		{
			if(x == a[i] + a[j])
			{
				System.out.println(a[i]+" "+a[j]);
			}
			
			j++;
		}
		
		print_subset(a , x , i + 1);
	}
}
