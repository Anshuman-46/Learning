package C_PATTERN;
import java.util.Scanner;
public class P1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
															/*       ABCD              
															 		 BCDE
															 		 CDEF
															 		 DEFG				*/
		int s;
		for(int i=1;i<=n;i++)
		{
			s=(char)'A'+i-1;
			for(int j=1;j<=n;j++)
			{
				System.out.print(s);
				s=(char)(s+1);
			}
		 System.out.println();
		}

	}

}
