package strings;

import java.util.Scanner;

public class StringDiff {

	public static String StringDifference(String s) {
		StringBuilder sb=new StringBuilder();
		sb.append(s.charAt(0));
		for (int i=1;i<s.length();i++) {
			char curr=s.charAt(i);
			char prev=s.charAt(i-1);
			int gap=curr-prev;
			sb.append(gap);
			sb.append(curr);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(StringDifference(str));
	}

}
