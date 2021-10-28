package Loops;

import java.util.Scanner;

public class Sum_Product {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int c=sc.nextInt();
		
		int sum=0,pro=1;
		
		for(int i=1;i<=n;i++)
		{
			if(c==1)
				sum=sum+i;
			if(c==2)
				pro=pro*i;
		}
		if(c==1)
			System.out.print(sum);
		else if(c==2)
			System.out.print(pro);
		else
			System.out.print("-1");

	}

}
