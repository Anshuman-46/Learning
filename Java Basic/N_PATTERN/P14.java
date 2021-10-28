package N_PATTERN;

import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
												 /*          _ _ _ _ _ _ 1
															 _ _ _ _ 2 3 2
															 _ _ 3 4 5 4 3
															 4 5 6 7 6 5 4           */
		int val,c;
		for(int i=1;i<=n;i++) {
			
			val =i;
			c=val;
			
			for(int j=1;j<=n-i;j++)
				System.out.print("  ");
			
			for(int k=1;k<=i;k++)
				
				   System.out.print(c);
				   c=val++;
				
			
			
			for(int l=2;l<=i;l++)
				{
				  // System.out.print(c);
				   c--;
				}
			
			System.out.println();
		}

	}

}
