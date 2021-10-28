package N_PATTERN;

import java.util.Scanner;

public class S_P_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
															/*       _ _ *
															 		 _ * * *
															         * * * * *     
															         _ * * *    
															         _ _ *                 */
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print("*");
			for(int j=2;j<=i;j++)
				System.out.print("*");
			
		 System.out.println()	;
		}
		
		for(int i=1;i<=n-1;i++)
		{
			for(int j=2;j<=i;j--)
				System.out.print(" ");
			for(int j=n-1;j>=i;j--)
				System.out.print("*");
			for(int j=n-2;j<=i;j++)
				System.out.print("*");
			
		 System.out.println();	
		}
	}

}
