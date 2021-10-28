package Generics;

public class Print {
 
	public static <T> void printArray (T a[]) {
		for(int i = 0 ;i < a.length ; i ++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		
		System.out.println();
	}
	
	public static void main(String [] args) {
		Integer a [] = new Integer [10];
		for(int i =0 ;i < a.length ;i++)
			a[i] = a.length - i;
		
		String arr [] = new String [10];
		 
		for(int i = 0 ; i < arr.length ; i++)
			arr[i] = (i);
			
		printArray(a);
	}
	
}
