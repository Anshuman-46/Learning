package Recursion;
import java.util.Scanner;

public class Fibinacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		for(int i=1;i<=n;i++)
//			System.out.print(fibo(i)+" ");		// fibonacci series till nth term
		
		System.out.println(fibo(n));  	// for the nth term of fibonacci series
	}
	
	public static int fibo(int n) {
		
/*		if(n==1)
			return 0;
		
		else if(n==2)         main problem is due to n == 2 as it want fib(0) & fib (-1) <= -ve not possible
			return 1;						*/
		
		if(n==0 || n==1)
			return n;					// best way than above
		
		return fibo(n-1)+fibo(n-2);
	}
}
