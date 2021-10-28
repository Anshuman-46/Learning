package Loops;

import java.util.Scanner;

public class BasicSalary {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

float b=sc.nextInt();
sc.nextLine();
char g=sc.nextLine().charAt(0);
float a;
float h=(20*b)/100;
float d=(50*b)/100;
float p=(11*b)/100;

if(g=='A')
	a=1700;
else if(g=='B')
	a=1500;
else
	a=1300;
	
double r1=b+h+d+a-p;                // Just to roundoff the number
long r2=(int)((int)b+h+d+a-p);

double r11=r1+0.5;					// Just to roundoff the number	
long r22=r2+1;						// Just to roundoff the number

if(r11>r22)							// Just to roundoff the number			
	System.out.println(r22);
else								// Just to roundoff the number
	System.out.println(r2);

	}

}
