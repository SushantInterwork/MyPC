package patterns;

import java.util.Scanner;

public class FiboPattern {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		int i,j;
		int a=0;
		int b=1;
		for(i=0;i<=n;i++) {
			for(j=0;j<=i;j++) {
			System.out.print(a+"\t");
			int c=a+b;
			a=b;
			b=c;
			}
			System.out.println();
		}
	}
}
