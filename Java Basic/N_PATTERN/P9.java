package N_PATTERN;

import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
												 /*          1
															 22
															 333
															 4444           */
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print(j);
			System.out.println();
		}
		

	}

}
