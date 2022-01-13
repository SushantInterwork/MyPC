package patterns;

import java.util.Scanner;

public class Table {
	public static void main(String args[]) {
		Scanner scn= new Scanner(System.in);
		System.out.println("enter the no.");
		int x=scn.nextInt();
		int i;
		for(i=1;i<=10;i++) {
			System.out.println(x+"*"+i+"="+(x*i));
		}
	}
}
