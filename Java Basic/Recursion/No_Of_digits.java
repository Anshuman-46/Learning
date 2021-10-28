package Recursion;
import java.util.Scanner;
public class No_Of_digits {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println("No. of digits in "+n+" : "+digit(n/10));
	}
	
	public static int digit(int n) {
		if(n==0)
			return 1;
		else
			return  1+digit (n/10);
	}
}
