package Functions;

import java.util.Scanner;

public class Prime_N {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n=sc.nextInt();
        primeN(n);
	}

	public static void primeN(int n)
	{
		for(int i=2;i<=n;i++)
		{
			if(prime(i)==true)
		
				System.out.print(i+" ");
		}	
	}
	
	public static boolean prime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				return false;
		}	
		return true;
	}
}
