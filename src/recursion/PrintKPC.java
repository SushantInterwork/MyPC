package recursion;

import java.util.Scanner;

public class PrintKPC {
	  static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx","yz"};
	  
	public static void printkpc(String ques,String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		char c=ques.charAt(0);
		String rest=ques.substring(1);
		
		String code=codes[c -'0'];
		for(int i=0;i<code.length();i++) {
			char ch=code.charAt(i);
			printkpc(rest,ans+ch);
		}
		
	}

	public static void main(String[] args)  {
	    Scanner scn = new Scanner(System.in);
	    String str = scn.next();
	    printkpc(str," ");
	
}
}
