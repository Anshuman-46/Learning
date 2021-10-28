package Loops;

import java.util.Scanner;

public class A_P {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	
//	int x;
//	for(int i=1;i<=n;i++)
//	{
//		x = (3*i)+2;
//		if(x%4!=0)
//			System.out.print(x);
//	}
	int a;
	while(n!=0)
	{
		a=n%10;
		if(a>0)
			System.out.print(a+"");
		n/=10;
	}
	
	}

}
