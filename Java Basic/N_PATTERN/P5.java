package N_PATTERN;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
												 /*          1
															 23
															 345
															 4567           */
		int val;
		for(int i=1;i<=n;i++)
		{
			val =i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(val);
				val++;
			}
		System.out.println();	
		}
		
	}

}
