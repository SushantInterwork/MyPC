package patterns;

import java.util.Scanner;

public class HollowDiamond {
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the value of n");
	 int n=sc.nextInt();
	 int i,j; 
	 int st=1;
	 int ospc=n/2;
	 int ispc=-1;  //for convinience(-1) , similar to 0
	 for( i=1;i<=n;i++) {
		 for( j=1;j<=ospc;j++) {
			 System.out.print(" ");
		 }
		 for(j=1;j<=st;j++) {
			 System.out.print("* ");
		 }
		 for( j=1;j<=ispc;j++) {
			 System.out.print(" ");
		 }
		if (i>1 && i<n) {
			 System.out.print("* ");
		 }
		 System.out.println();
		 if(i<=n/2) {
			 ospc--;
			 ispc+=2;
		 }
		 else {
			 ospc++;
			 ispc-=2;
		 }
	 }
 }
}
