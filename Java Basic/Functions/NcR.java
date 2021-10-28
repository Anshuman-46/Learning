package Functions;
import java.util.Scanner;
public class NcR {
	
	public static int fac (int n)				// FUNCTION DEFINATION
	{
		int ans=1;
		for(int i=1;i<=n;i++)
			ans=ans*i;
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
				
		int n=sc.nextInt();
		int r=sc.nextInt();
		
		int fn=fac(n);             // FUNCTION CALLING
		int fnr=fac(n-r);
		int fr=fac(r);
		
		int result = (fn)/(fnr*fr);
		 
		 System.out.println(result);
	}

}
