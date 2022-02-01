package recursion;

import java.util.Scanner;

public class Permutation {
	public static void printpmt(String ques,String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<ques.length();i++) {
		char ch=ques.charAt(i);
		String left=ques.substring(0,i);
		String right=ques.substring(i+1);
		String rest=left +right;
		printpmt(rest,ans+ch);
		}
	}

	public static void main(String[] args)  {
	    Scanner scn = new Scanner(System.in);
	    String str = scn.next();
	    printpmt(str," ");
}
}
