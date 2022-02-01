package recursion;

import java.util.Scanner;

public class PrintMazepath {
	public static  void pmp(int sr,int sc,int m,int n,String ans) {
		if(sr==m && sc==n) {
			System.out.println(ans);
			return;
		}
		if(sc<n) {
		pmp(sr,sc+1,m,n,ans+"h");
		}
		if(sr<m) {
		pmp(sr+1,sc,m,n,ans+"v");
		}
	}
	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
		    int m = scn.nextInt();
		    int n = scn.nextInt();
		    pmp(1,1,m,n," ");
	}
}
