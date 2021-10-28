package Functions;
import java.util.Scanner;
public class Prime {
	
	public static boolean prime (int n)
	{	
		
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Scanner sc =new Scanner(System.in);
		
		int n=sc.nextInt();
		
		boolean ans=prime(n);
		
		System.out.println(ans);
	}

}
