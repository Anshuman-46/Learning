package N_PATTERN;

import java.util.Scanner;

public class P10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
												 /*          1
															 21
															 321
															 4321           */
		
		for(int i=1;i<=n;i++)
		{	
			int val=i;
			for(int j=1;j<=i;j++)
			{	
				System.out.print(val);
				val--;
			}
		System.out.println();			
		}
		

	}

}
