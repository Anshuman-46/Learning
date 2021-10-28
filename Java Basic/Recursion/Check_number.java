package Recursion;

import java.util.Scanner;

public class Check_number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("No. of times to use : ");
		int t = sc.nextInt();
		
		int i=1;
		while(i<=t)
		{
			System.out.print("No. of element of array : ");
			int n = sc.nextInt();
			
			int arr [] = new int [n];
			System.out.println("Enter the element of array");
			
			for(int j=0;j<n;j++)
				arr[j] = sc.nextInt();
			
			System.out.print("Enter the element to search : ");
			int x = sc.nextInt();
			
			System.out.println(checkBetter(arr,x));   // two approaches = 1 + 1 (better)
//			System.out.println(check(arr,x));
			i++;
		}	
	}
	
	public static boolean check(int [] a,int x) {
		
		if(x != a[0] && a.length == 1)
			return false;
		
		if(x == a[0])
			return true;
		
		else 
		{
			int [] find  = new int [a.length-1];
			
			for(int i=0;i<find.length;i++)
				find[i] = a[i+1];
		
			return check(find,x);
		}
	}

//  the user should not know which logic we are using so they INPUT the ARRAY and get the ANSWER 
	public static boolean checkBetter(int []a,int x)
	{
		return checkBetter(a,x,0);
	}
	
	
//  private i.e., only for developer	
//  name can be same as they are PUBLIC and PRIVATE
	
	private static boolean checkBetter(int []a,int x, int startIndex)
	{
		if(x == a[startIndex])
			return true;
		
//		if(x != a[startIndex] && a.length == 1 )   =>  here never the length of array (a) will be 1 as it never pass a new array
//			return false;						   =>  it will give the stackOverflow error
		
//		if(x != a[startIndex])
//			return false;
		
//		Both approaches will work better ( above and below )		
		
		if(x != a[startIndex] && startIndex == a.length - 1 )
			return false;
		
		else
			return checkBetter(a , x , startIndex + 1);
	}
}
