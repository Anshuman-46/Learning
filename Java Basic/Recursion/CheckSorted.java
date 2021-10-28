package Recursion;
import java.util.Scanner;
public class CheckSorted {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of elements : ");
		int n = sc.nextInt();
		
		System.out.println("Enter array : ");
		int arr [] = new int [n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		System.out.println(checkBetter(arr));   // two approaches +  1 better approach
	}
	
	public static boolean check (int [] arr)
	{
		if(arr.length <= 1)
			return true;
		
		int newarr [] = new int [arr.length-1];
		
		for(int i=0;i<newarr.length;i++)
			newarr[i] = arr[i+1];
		
		boolean newAns = check(newarr);    // first checking n-1 then 1
		
		if(!newAns)
			return false;
		
		if(arr[0] <= newarr[0])
				return true;
			else
				return false;
	}
	
	public static boolean check2(int [] arr)
	{
		if(arr.length <= 1)
			return true;
		
		if(arr[0] > arr[1])						// first checking 1 then n-1
			return false;
		
		int small [] = new int [arr.length-1];
		
		for(int i=0;i< small.length ; i++)
			small [i] = arr [i+1];
		
		boolean ans = check2(small);
		
//		if(ans)
//			return true;
//		else 
//			return false;
		
		return ans;
	}

	
//  the user should not know which logic we are using so they INPUT the ARRAY and get the ANSWER 
	public static boolean checkBetter(int []a)
	{
		return checkBetter(a,0);
	}
	
	
//  private i.e., only for developer	
//  name can be same as they are PUBLIC and PRIVATE
	
	private static boolean checkBetter(int []arr , int startIndex)
	{
		if(startIndex == arr.length - 1)
			return true;
		
		if(arr[startIndex] > arr[startIndex + 1])
			return false;
		
		boolean ans = checkBetter(arr,startIndex + 1) ;
		return ans;
	}
}
