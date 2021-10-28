package Array_2D;
import java.util.Scanner;
public class Matrix_multiplication {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner (System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();

		int a[][] =  new int [n][m];
		int b[][] = new int [n][m];
		int c[][] = new int [n][m];
		
		System.out.println("enter matrix1");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++)
				a[i][j] = sc.nextInt();
		}
		
		System.out.println("matrix 1");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		
		System.out.println("enter matrix2");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++)
				b[i][j] = sc.nextInt();
		}
		
		System.out.println("matrix 2");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++)
				System.out.print(b[i][j]+" ");
			System.out.println();
		}
		int sum;
	//	System.out.println("enter matrix1");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				sum = 0;
				for(int k=0;k<n;k++)
					c[i][j] = a[i][k] + b[k][j] + c[i][j];
				}
			}
		
		System.out.println("matrix 1 X matrix 2");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++)
				System.out.print(c[i][j]+" ");
			System.out.println();
		}
	}

}
