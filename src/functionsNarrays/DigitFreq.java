package functionsNarrays;

import java.util.Scanner;

public class DigitFreq {
	public static void frequency(int n,int d) {
		int count=0;
		while(n>0) {
		
		int rem=n%10;
		n=n/10;
		if(rem==d) {
			count++;
		}
		}
		System.out.println(count);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		frequency(n,d);
	}
}
