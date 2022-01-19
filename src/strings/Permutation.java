package strings;

import java.util.Scanner;

public class Permutation {
	
	public static void permutation(String s) {
		int fact=factorial(s);
		for(int i=0;i<fact;i++) {
			StringBuilder sb=new StringBuilder(s);
			int temp=i;
			for(int div=s.length();div>=1;div--) {
				int quo=temp/div;
				int rem=temp%div;
				System.out.print(sb.charAt(rem));
				sb.deleteCharAt(rem);
				temp=quo;
			}
			System.out.println();
			}
	}

	public static int factorial(String s) {
		int f=1;
		for(int i=2;i<=s.length();i++) {
			 f=f*i;
		}
		return f;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		permutation(str);
	
	}

}
