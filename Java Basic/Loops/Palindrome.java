package Loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc =  new Scanner (System.in);
		int n=sc.nextInt();
		int t=n,s=0,a;
		while(n!=0){
			a=n%10;
		//	System.out.println("n : "+n);
			n=n/10;
		//	System.out.println("sum = "+s);
			s=s*10+a;
		}
		if(s==t)
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
