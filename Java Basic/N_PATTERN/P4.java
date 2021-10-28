package N_PATTERN;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
												 /*          4321
															 4321
		BY THREE DIFFERENT METHODS							 4321
															 4321           */
		
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=n;j>=1;j--)
//				System.out.print(j);
//			System.out.println();
//		}
		
		
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=0;j<=n-1;j++)
//				System.out.print(n-j);
//			System.out.println();
//		}
		
		
		for(int i=1;i<=n;i++)					// change in i only
		{
			for(int j=1;j<=n;j++)				// change in j only
				System.out.print(n-j+1);		// pattern regarding change i.e. i/j/n
			System.out.println();
		}
		
	}

}
