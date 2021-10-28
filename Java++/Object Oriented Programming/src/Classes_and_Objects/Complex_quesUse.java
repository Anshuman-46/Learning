package Classes_and_Objects;
import java.util.Scanner;
public class Complex_quesUse {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter first complex number : Real then Imaginary ");
		int real1 = sc.nextInt();
		int imaginary1 = sc.nextInt();
		
		Complex_ques c1 = new Complex_ques(real1,imaginary1);
	
		System.out.println("Enter first complex number : Real then Imaginary ");
		int real2 = sc.nextInt();
		int imaginary2 = sc.nextInt();
		
		Complex_ques c2 = new Complex_ques(real2,imaginary2);
		
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		if(n == 1)
		{
			Complex_ques ans = Complex_ques.add(c1,c2);
			ans.print();
		}
		
		if(n == 2)
		{
			Complex_ques ans = Complex_ques.multiply(c1,c2);
			ans.print();
		}
	}

}
