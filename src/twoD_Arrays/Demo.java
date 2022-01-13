package twoD_Arrays;

import java.util.Scanner;

public class Demo {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of m and n");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int arr[][]=new int[m][n];
		int i,j;
		for(i=0;i<m;i++) {
			System.out.println("enter elements of"+i+"row");
			for(j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<arr.length;i++) {       //arr.length or m
			for(j=0;j<arr[i].length;j++) {   //arr[i].length or n
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
