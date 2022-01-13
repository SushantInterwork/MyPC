package twoD_Arrays;

import java.util.Scanner;

public class WaveTraverse {

	public static void main(String[] args) {
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
			for(j=0;j<arr[0].length;j++) {
				if(j%2==0) {
					for(i=0;i<arr.length;i++) {
						System.out.println(arr[i][j]);
					}
				}
					else
					{
						for(i=arr.length-1;i>=0;i--) {
							System.out.println(arr[i][j]);
						}
					}
				System.out.println();
				}
			}
	}


