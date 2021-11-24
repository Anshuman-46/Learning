package Mini_Project;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		int n1 = sc.nextInt();
		
		System.out.print("Enter the second number : ");
		int n2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter the opertion to perform : ");
		char operator = sc.nextLine().charAt(0);
		
		double result = 0;
		
		switch (operator)
		{
		case '+' : result = n1 + n2 ;
					break;
					
		case '-' : result = n1 - n2 ;
					break;
					
		case '/' : result = (double)n1 / n2 ;
					break; 
					
		case '*' : result = n1 *  n2 ;
					break;
					
		default : System.out.println("Invalid operator ");
		}
		
		System.out.println("Answer : "+result);
	}
}