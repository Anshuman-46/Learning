package Recursion_String;

import java.util.Scanner;

public class Quick_Sort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
  	  
	  System.out.print("Enter the number of element of array : ");
  	  int n = sc.nextInt();
  	  
  	  int a [] = new int[n];
  	  
  	  System.out.println("Enter the array : ");
  	  for(int i=0;i<n;i++)
  		  a[i] = sc.nextInt();
  		  
  	  quickSort(a);
  	  
  	  System.out.println("Sorted array : ");
           for (int i = 0; i < a.length; i++)
                  System.out.print(a[i] + " ");
    }
    
	public static void quickSort(int[] a) 
	{
       quickSort(a, 0, a.length - 1);
	}

	private static void quickSort(int[] a, int si, int ei) {
	      //  '<' is wrong , use '<='
		  if (si < ei) {
			  
	              int pivotIndex = partition(a, si, ei);
	              // part 1
	              quickSort(a, si, pivotIndex - 1);
	             //part 2
	              quickSort(a, pivotIndex + 1, ei);
	       }
	}
	
	
	/** Partition the array a[si..ei] */
	private static int partition(int[] a, int si, int ei) {
		  
	    int pivot = a[si]; // Choose the si element as the pivot
	    int i = si + 1; // Index for forward search  => i = si  => time taken will be more i.e., only disadvantage .
	    int j = ei; // Index for backward search
	
	 // any of "if" or "while" can be used
	    if (i < j)    // because sometime " i ... j " positions changed to " j ... i "
	    {
	  	  
	              // Search forward from left  => check by moving towards end_index
	              while (i <= j && a[i] <= pivot) //  checking everytime - after every step it is changing : i<=j 
	                    i++;						//  we want smaller elements than pivot at L.H.S
	
	              
	              // Search backward from right  => check by moving towards start_index
	              while (i <= j && a[j] > pivot)
	                    j--;						////  we want larger elements than pivot at R.H.S
	
	              
	              // Swap two elements in the 'a'
	              if (i < j) 		// then i & j will swap at correct position 
	              {
	                    int temp = a[j];
	                    a[j] = a[i];
	                    a[i] = temp;				// swap left smaller to right larger
	              }
	      }
	
	      while (j > si && a[j] >= pivot)   // highest mistake done
	              j--;
	
	       // Swap pivot with a[j]
	       if (pivot > a[j])   // **** mostly error occur
	       {
	              a[si] = a[j];
	              				/*
	              				 * 		int arr [] = {1,2};
											int t = arr[0];
											arr[0] = 32;
											System.out.println(t);  => t = 1
	              				 */
	              a[j] = pivot;
	              return j;
	       } 
	       
	       else 
	              return si;   
		}
  }