package N_PATTERN;

import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
												 /*          _ _ _ _1
															 _ _ 1 2
															 1 2 3            */
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++)
				System.out.print("  ");
			for(int k=1;k<=i;k++)
				System.out.println(k);
			System.out.println();
		}

	}

}