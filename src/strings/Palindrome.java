package strings;

import java.util.Scanner;

public class Palindrome {
	
	public static boolean isPalindrome(String s) {
		int i=0;
		int j=s.length()-1;
		
		while(i<=j) {
			char a=s.charAt(i);
			char b=s.charAt(j);
			if(a!=b) {
				return false;
			}
			else {i++;
			j--;}
			
		}
		return true;
	}
	
	public static void answer(String s) {
	for(int i=0;i<s.length();i++) {
		for(int j=i+1;j<=s.length();j++) {
			String subs=s.substring(i,j);
			if(isPalindrome(subs)==true) {
				System.out.println(subs);
			}
		}
	}
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
	     answer(str);
	}
}
