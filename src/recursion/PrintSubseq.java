package recursion;

import java.util.Scanner;

public class PrintSubseq {
	  
	  
	public static void printss(String ques,String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		char c=ques.charAt(0);
		String rest=ques.substring(1);
			printss(rest,ans+c);
			printss(rest,ans+" ");
	}

	public static void main(String[] args)  {
	    Scanner scn = new Scanner(System.in);
	    String str = scn.next();
	    printss(str," ");
	
}
}


