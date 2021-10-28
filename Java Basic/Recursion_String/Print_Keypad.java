package Recursion_String;

import java.util.Scanner;

public class Print_Keypad {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		  
		  System.out.print("Enter the number : ");
		  
		  int n = sc.nextInt();
		  
		  System.out.println("The possible sequences are : ");
		  keypad(n);
	  }
	  
	  public static void keypad(int n)
	  {
		  keypad(n,"");
	  }
	  
	  public static void keypad(int n,String ans)
	  {
		  
		  if(n == 0)
		  {
			  System.out.print(ans+" ");
			  return;
		  }
		  
		  char temp[] = helper(n % 10);

		  for(int i = 0 ; i < temp.length ;i++)
		  {
			  keypad(n/10 , temp[i] + ans);
		  }
	  }
	
	  private static char[] helper(int x)
	  {
		  if(x == 1)
		  {	
			  char ch [] = {' '};
		  	  return ch;
		  }
		  
		  else if(x == 2)
		  {
			 char ch [] = {'a','b','c'};
			 return ch;
		  }
		  
		  else if(x == 3)
		  {
			 char ch [] = {'d','e','f'};
			 return ch;
		  }
		  
		  else if(x == 4)
		  {
			 char ch [] = {'g','h','i'};
			 return ch;
		  }
		  
		  else if(x == 5)
		  {
			 char ch [] = {'j','k','l'};
			 return ch;
		  }
		  
		  else if(x == 6)
		  {
			 char ch [] = {'m','n','o'};
			 return ch;
		  }
		  
		  else if(x == 7)
		  {
			 char ch [] = {'p','q','r','s'};
			 return ch;
		  }
		  
		  else if(x == 8)
		  {
			 char ch [] = {'t','u','v'};
			 return ch;
		  }
		  
		  else if(x == 9)
		  {
			 char ch [] = {'w','x','y','z'};
			 return ch;
		  }
		  
		  else
			  {	
			    char ch [] = {' '};
			  	return ch;
			  }
	  }
		
}