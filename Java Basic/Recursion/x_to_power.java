package Recursion;

import java.util.Scanner;

public class x_to_power {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		System.out.println(x+"^"+y+" : "+power(x,y));
	}

	public static int power (int x,int y)
	{
		if(y==0)
			return 1;
		int small = power(x,y-1);
		return (x*small);
	}
}