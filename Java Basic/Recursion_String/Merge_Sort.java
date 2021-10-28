package Recursion_String;

import java.util.Scanner;

public class Merge_Sort {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner (System.in);
		
		System.out.print("Enter the number of element of array : ");
		int n = sc.nextInt();

// 		this is the first program in which we have changed original value (entered) using recursion but without using any return_type function		
		
		int arr [] = new int [n];
		
		System.out.println("Enter the array : ");
		for(int i=0;i<arr.length;i++)
			arr[i] = sc.nextInt();
		
//		can't use any private function as we want only "void" function
		mergeSort(arr);
		
		System.out.println("The sorted array is : ");
		for(int i =0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
	}
	
	public static void mergeSort(int [] input)
	{
		// can't use return statement so just call the function
		mergeSort(input,0,input.length - 1);
	
// mistake could be : as startIndex = 0 and endIndex = input.length		
	}
	
	private static void mergeSort(int []input,int sI,int eI)
	{
		// don't forget to add the base case
		if(sI >= eI)	// only one element left i.e., totally sorted then return only 
			return;
		
		int mid = (sI + eI)/2;
		
		//part 1
		mergeSort(input,sI,mid);
		
		//part 2
		mergeSort(input,mid + 1,eI);
		
		merge(input,sI,eI);
	}
	
	private static void merge (int []input , int sI , int eI)
	{
		int mid = (sI + eI)/2;
//							 error may occur
		int ans [] = new int [eI - sI + 1];
		
		int i = sI;
		
// 		j != mid i.e, mid + 1;		
		int j = mid + 1;
		
		int k = 0;
		
//		it might be less_than or also with equals_to		
//  	at every place their is equal to (=)sign 
		
		while(i <= mid && j <= eI)
		{
			if(input[i] < input[j])
			{
				ans[k] = input[i];
				i++;
				k++;
			}
// 		whenever applying '<' their will always an equal '=' :  "<="			
			else
			{
				ans[k] = input[j];
				k++;
				j++;
			}
		}
		
		while (i <= mid)
		{
			ans[k] = input[i];
			k++;
			i++;
		}
		
//			j <= input.length <= wrong <- an error is occurred		
		
		while (j <= eI)
		{
			ans[k] = input[j];
			k++;
			j++;
		}
		
		for(int index = 0 ; index < ans.length ; index ++)
			// 	 sI ... error may occur i.e., it is not important that element si = 0 ;
			input[sI + index] = ans[index];
	}
}