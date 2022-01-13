package twoD_Arrays;

import java.util.Scanner;

public class Multiplication {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of m and n for mat1");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		int mat1[][]=new int[r1][c1];
		int i,j;
		for(i=0;i<r1;i++) {
			System.out.println("enter elements of"+i+"row");
			for(j=0;j<c1;j++) {
				mat1[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter value of m and n for mat2");
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		int mat2[][]=new int[r2][c2];
		for(i=0;i<r2;i++) {
			System.out.println("enter elements of"+i+"row");
			for(j=0;j<c2;j++) {
				mat2[i][j]=sc.nextInt();
			}
		}
		if(c1!=r1) {
			System.out.println("invalid input");
			return;
		}
		
		int prod[][]=new int[r1][c2];
		for(i=0;i<r1;i++) {
			for(j=0;j<c2;j++) {
				for( int k=0;k<c1;k++) {     //k<c1 is same as k<r2
					prod[i][j]=mat1[i][k]*mat2[k][j];
				}
			}
		}
		
		for(i=0;i<r1;i++) {
			for(j=0;j<c2;j++) {
				System.out.print(prod[i][j]+" ");
			}
		}
		System.out.println();
}
}
