package N_PATTERN;

import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
															/*       _ _ _ 1
															 		 _ _ 1 2 1
															 		 _ 1 2 3 2 1
															 		 1 2 3 4 3 2 1     */
		int val;
		for(int i=1;i<=n;i++)
		{	val =i-1;
			for(int j=n;j>=i;j--)
				System.out.print(" ");
			for(int k=1;k<=i;k++)
				System.out.print(k);
			for(int l=2;l<=i;l++)
				{ 
						System.out.print(val);
						val--;
				}
			System.out.println();
		}

	}

}
