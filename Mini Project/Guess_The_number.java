package Mini_Project;
import java.util.Scanner;
public class Guess_The_number {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int myNumber=(int)(Math.random()*100);
		
		int userNumber = 0;
		
		System.out.println("GUESS THE NUMBER :");
		do
		{
			userNumber = sc.nextInt();
			
			if(myNumber == userNumber)
			{
				System.out.println("SAME NUMBER ");
				break;
			}
			
			else if(myNumber > userNumber)
				System.out.println("YOUR NUMBER IS TOO SMALL");
			
			else 
				System.out.println("YOUR NUMBER IS TOO LARGE");
			
		} while(userNumber >= 0);
		
		System.out.println("\nCORRECT NUMBER : "+myNumber);
	}

}
