package Array_Application;
import java.util.Scanner;
public class Duplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no. of time to enter the array");
		int x=sc.nextInt();
		for(int i=1;i<=x;i++)
		{	System.out.println("Enter number of element");
			int n=sc.nextInt();
			int ar[]=new int[n];
			ar=input(n);
			System.out.println("No. is "+find(ar));
		}
	}
	
	
	public static int [] input(int n)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array");
		int arr[]=new int [n];
		for(int i=0;i<n;i++)
		   arr[i]=sc.nextInt();	
		return arr;
	}
	
		public static int find(int []arr)
		{
			int f;
			for(int i=0;i<arr.length;i++)
			{  
				f=arr[i];
				for(int j=1;j<arr.length;j++)
				{
					 if(f==arr[j])
					  return f;
					 
					 else
					  continue; 
				 }
			}
			return 0;
		}

}
