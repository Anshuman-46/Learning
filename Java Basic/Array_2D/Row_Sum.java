package Array_2D;
import java.util.Scanner;
public class Row_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no. of times to enter array 2D");
		int t=sc.nextInt();
		
		System.out.println("Enter rows of array 2D");
		int r=sc.nextInt();
		
		System.out.println("Enter cols of array 2D");
		int c=sc.nextInt();
		
		for(int i=1;i<=t;i++)
		{
			int arr [] [] = input(r,c);
			print(arr);
			rowsum(arr);
		}
	}

	
	public static int [] [] input(int r,int c)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter array 2D");
		int arr [][]= new int [r][c];
		for(int j=0;j<r;j++)
		{
			for(int k=0;k<c;k++)
				arr[j][k]=sc.nextInt();
		}
		
		return arr;
	}
	
	public static void print(int [][]arr) {
		System.out.println("The array is : ");
		for(int j=0;j<arr.length;j++)
		{
			for(int k=0;k<arr[0].length;k++)
				System.out.print(arr[j][k]+" ");
			
			System.out.println();
		}	
	}
	
	public static void rowsum(int [][]arr)
	{
		System.out.println("The summation of row is : ");
		for(int j=0;j<arr.length;j++)
		{
			int sum=0;
			for(int k=0;k<arr[0].length;k++)
				sum=sum+arr[j][k];
			
			System.out.println(sum);
		}	
	}
}
