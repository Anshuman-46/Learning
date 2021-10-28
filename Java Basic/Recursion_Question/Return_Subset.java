package Recursion_Question;
import java.util.Scanner;
public class Return_Subset {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner (System.in);
		
		  System.out.print("Enter the number of elements of array : ");
		  int n = sc.nextInt();
		  
		  System.out.println("Enter the array : ");
		  int arr [] = new int [n];
		  
		  for(int i  = 0;i < arr.length ; i++)
			  arr[i] = sc.nextInt();
		  
		  System.out.print("Enter the number for subset : ");
		  int x = sc.nextInt();
		  
		  int ans [] [] = return_subset (arr,x);

//		  return_subseting is not corrected 		  
		  for(int i = 0 ; i < ans.length;i++)
		  {
			  for(int j = 0;j < ans[0].length;j++)
			  {
				  if(ans[i][j] > 0)
				  System.out.print(ans[i][j]+" ");
			  }
			  if(i < 1)
				  System.out.println();
		  }
		  
	  }
	  
	  public static int [] [] return_subset (int [] arr,int x)
	  {
		  int start = 0;	// start index for navigating array
		  int m = 0;		// for filling temp 2D array
		  
//		  assuming that their will be only two subset of 'x'		  
		  int temp [] [] = new int [arr.length - 1] [2];
		  
		  return return_subset (arr,x,start,m,temp);
	  }
	  
	  private static int [] [] return_subset (int [] a, int x,int i,int t , int temp [] [])
	  {
		  int j = i + 1 , b = 0;
		  if ( i == a.length - 1)
			  return  temp;
		  
		  if (a[i] >= x)
			  return return_subset (a,x,i+1,t+1,temp);
		  
		  while (j <= a.length - 1)
		  {
			  if (x == a[i] + a[j])
			  {
				  temp [t] [b] = a[i];
				  temp [t] [b+1] = a[j];
				  
				  return return_subset (a,x,i+1,t+1,temp); 
			  }
			  j++;
		  }
		  
		  return return_subset (a,x,i+1,t+1,temp);
		  
	  }
	}