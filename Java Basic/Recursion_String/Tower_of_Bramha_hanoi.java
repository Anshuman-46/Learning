package Recursion_String;
import java.util.Scanner;
public class Tower_of_Bramha_hanoi {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of disk : ");
		int n = sc.nextInt();
		
		int s=1,h=2,d=3,count=0;
		
		tob_toh(s,d,h,n);
		
		System.out.println("Number of times to move a disk : "+tob_toh(s,d,h,n,count));

		solve(n);
	}	
	
	public static void tob_toh(int s,int d,int h,int n)
	{
		if(n == 1)
		{
			System.out.println("move disk from "+s+" -> "+d);
			return ;
		}
		
		tob_toh(s,h,d,n-1);
		System.out.println("move disk from "+s+" -> "+d);
		
		tob_toh(h,d,s,n-1);
		return ;
	}

// for measuring the number of steps	
	
	public static int tob_toh(int s,int d,int h,int n,int count)
	{
		if(n == 1)
		{
			//System.out.println("move disk from "+s+" -> "+d);
			return count++;
		}
		
		tob_toh(s,h,d,n-1,count++);
		
		//System.out.println("move the disk from "+s+" -> "+d);
		count ++;
		
		tob_toh(h,d,s,n-1,count++);
		return count;
	}
	
	public static void solve(int n) {
		char s = 'a', d = 'c' , h = 'b';
		tower_of_hanoi(s,d,h,n);
	}
	
	public static void tower_of_hanoi(char s,char d,char h,int n)
	{
		if(n == 1)
		{
			System.out.println(s+" "+d);
			return;
		}
		
		tower_of_hanoi(s,h,d,n-1);
		System.out.println(s+" "+d);
		
		tower_of_hanoi(h,d,s,n-1);
	}
}