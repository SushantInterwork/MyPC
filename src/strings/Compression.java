package strings;

import java.util.Scanner;

public class Compression {

	public static void Compr1(String s){
		char firstch=s.charAt(0);
		String compressed=" "  ;
		    compressed+=firstch;
		for(int i=1;i<s.length();i++) {
			char curr=s.charAt(i);
			char prev=s.charAt(i-1);
			if(curr!=prev) {
				compressed=compressed+curr;
			}
		}
		System.out.println(compressed);
	}
	
	public static void Compr2(String s) {
	char firstchar=s.charAt(0);
	String compressed2=" "  ;
	    compressed2+=firstchar;
	    int count=1;
	    int i;
	for( i=1;i<s.length();i++) {
		char curr=s.charAt(i);
		char prev=s.charAt(i-1);
		if(curr==prev) {
			count++;
		}
		else {if(count>1) {    ///eg. aabcc  here c=1 so we shouldn't add 1
			compressed2+=count;
			count=1;
		}
		compressed2+=curr;
		}
	}
	if(count>1) {
		compressed2+=count;    //this is for the last character to add the count
		count=1;
	}
	System.out.println(compressed2);
}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
	     Compr1(str);
	     Compr2(str);
}
}
