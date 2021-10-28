package N_PATTERN;

import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
															/*       4444
															 		 333
															         22     
															         1       */
		int val=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
				System.out.print(val);
				
			val--;
		 System.out.println();	
		}
		

	}

}
