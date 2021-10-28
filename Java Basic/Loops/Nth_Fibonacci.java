package Loops;

import java.util.Scanner;

public class Nth_Fibonacci {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number for which position you want fibonacci :");
int n=sc.nextInt();

	int a=0,b=1;
	if(n==1)
		System.out.println(a);
	if(n==2)
		System.out.println(b);
	for(int i=1;i<=n-2;i++)
	{
		int c=a+b;
		if(n==i+2)
		{
			System.out.println(c);
			break;
		}
	 a=b;
	 b=c;
	}
	}

}
