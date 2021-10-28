package Loops;

import java.util.Scanner;

public class All_Prime {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int a;
		
		for(int i=2;i<=n;i++)
		{   a=1;
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					a=0;
					break;
				}
			}
		if(a==1)
			System.out.println(i);
		}
	}

}
