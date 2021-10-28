package Recursion_Question;

import java.util.Scanner;

public class BinarySearch_Recursion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		  
		  System.out.print("Enter the number of elements of array : ");
		  int n = sc.nextInt();
		  
		  int arr [] = new int [n];
		  
		  System.out.println("Enter the array :");
		  for (int i = 0 ; i < arr.length ;i++)
			  arr[i] = sc.nextInt();
		  
		  System.out.print("Enter the element to be searched : ");
		  int x = sc.nextInt();
		  
		  if (binary_recursion(arr,x) >= 0)
		  System.out.print("The element is at : "+binary_recursion(arr,x));
		  
		  else
			  System.out.println(binary_recursion(arr,x)+" means element is not present");
	  }
	  
	  public static int binary_recursion (int a[] , int x)
	  {
		  return binary_recursion(a,x,0,a.length);
	  } 
	  
	  private static int binary_recursion (int a[],int x , int start , int end)
	  {
		  int mid = (start + end)/2;
		  
		  if(a.length == mid) // when mid is approaching as start > end i.e., time to end
			  return -1;	  // but before that it also reaches, better to stop here
		  
		  if (a[mid] == x)
			  return mid;
		  
		  while (start < end)
		  {
			  if (a[mid] > x)
				  return binary_recursion(a,x,start,mid - 1);
			  
			  else
				  return binary_recursion(a,x,mid + 1,end);
		  }
		  
		  return -1;
	  }
}