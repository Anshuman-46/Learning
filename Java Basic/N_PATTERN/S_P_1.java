package N_PATTERN;

import java.util.Scanner;

public class S_P_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
															/*       _ _ _ *
															 		 _ _ * * *
															         _ * * * * *     
															         * * * * * * *       */
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
				System.out.print("  ");
			for(int j=1;j<=i;j++)
				System.out.print("* ");
			for(int j=2;j<=i;j++)
				System.out.print("* ");
			
		 System.out.println();	
		}

	}

}
