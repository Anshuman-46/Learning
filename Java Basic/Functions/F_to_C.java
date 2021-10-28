package Functions;

import java.util.Scanner;

public class F_to_C {
	
	public static void fc(int s,int e, int w)
	{
		int i=s;
		while(i<=e)
		{
			int x=(5*(i-32))/9;
			System.out.println(i+"\t"+x);
			i=i+w;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int s=sc.nextInt();
		int e=sc.nextInt();
		int w=sc.nextInt();
		
		fc(s,e,w);
	}

}
