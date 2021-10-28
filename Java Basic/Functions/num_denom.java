package Functions;
import java.util.Scanner;
public class num_denom {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the numerator : ");
		int num = sc.nextInt();
		
		System.out.print("Enter the denominator : ");
		int denom = sc.nextInt();
		
		//  num = 2, denom = 4 : fraction = 1/2 should be printed
		
		fraction(num,denom);
	}

	public static void fraction(int num, int denom) {
		int gcd = 1;
		int smaller = Math.min(num,denom);
		
		for(int i = 2;i <= smaller ;i++) {
			if(num % i == 0 && denom % i == 0)
				gcd = i;
		}
		
		num = num/gcd;
		denom = denom/gcd;
		print(num,denom);
	}
	
	private static void print(int num,int denom) {
		
		if(denom == 1)
			System.out.println("fraction : "+num);
		
		else
			System.out.println("fraction : "+num+"/"+denom);
	}
	
}