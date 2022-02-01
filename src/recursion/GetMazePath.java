package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePath {
	public static   ArrayList< String> gmp(int sr,int sc,int m,int n) {
		if(sr==m && sc==n) {
			 ArrayList< String> nothing=  new ArrayList<String>();
			 nothing.add(" ");
			 return nothing;

		}
		ArrayList< String> hpath =new ArrayList<String>(); 
		ArrayList< String> vpath =new ArrayList<String>(); 
		if(sc<n) {
			hpath = gmp(sr,sc+1,m,n);
		}
		if(sr<m) {
		  vpath = gmp(sr+1,sc,m,n);
		}
		  ArrayList< String> answer=  new ArrayList<String>();
		  
		  for(String temp:hpath) {
			  answer.add("h"+temp);
		  }
		  for(String temp:vpath) {
			  answer.add("v"+temp);
		  }
		  return answer;
	}
	public static void main(String[] args) {
		  Scanner scn = new Scanner(System.in);
		    int m = scn.nextInt();
		    int n = scn.nextInt();
		    
		   ArrayList< String> result =  gmp(1,1,m,n);
		   System.out.println(result);
	}
}
