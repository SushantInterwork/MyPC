package recursion;

import java.util.Scanner;

public class PrintStairpath {
	  
	  
	public static void printsp(int ques,String ans) {
		if(ques==0 ) {
			System.out.println(ans);
			return;
		}
		if(ques<0) {
			return;
		}
			printsp(ques-1,ans+1);
			printsp(ques-2,ans+2);
			printsp(ques-3,ans+3);

	}

	public static void main(String[] args)  {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    printsp(n," ");
	
}
}


