package C_PATTERN;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
															/*       A              
															 		 BB
															 		 CCC
															 		 DDDD				*/
		char c='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(c);
				
			}
			c=(char)(c+1);
			System.out.println();
		}

	}

}
