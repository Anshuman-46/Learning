package Loops;

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int a,sume=0,sumo=0;	
		while(n!=0)				// till it become 0
		{
			a=n%10;
			if(a%2==0)
				sume=sume+a;
			else
				sumo=sumo+a;
			n/=10;	
		}
		System.out.println(sume+" "+sumo);

	}

}
