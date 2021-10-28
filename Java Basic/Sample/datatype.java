package Z;

import java.util.Scanner;

public class datatype {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t=sc.nextInt();

		for(int i=1;i<=t;i++)
		{
			long n=sc.nextLong();
			if(n>=-Math.pow(2, 7) && n<=Math.pow(2, 7)-1)
				System.out.println(n+" can be fitted in :\n*Byte \n*Short\n*int\n*long");

			else if(n>=-Math.pow(2, 15) && n<=Math.pow(2, 15)-1)
				System.out.println(n+" can be fitted in :\n*Short\n*int\n*long");

			else if(n>=-Math.pow(2, 31) && n<=Math.pow(2, 31)-1)
				System.out.println(n+" can be fitted in :\n*int\n*long");

			else if(n>=-Math.pow(2, 63) && n<=Math.pow(2, 63)-1)
				System.out.println(n+" can be fitted in :\n*long");

			else
				System.out.println(n+" can not be fit anywhere");

		}

	}

}
