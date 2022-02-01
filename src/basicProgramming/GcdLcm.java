package basicProgramming;
import java.util.Scanner;

public class GcdLcm {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two nos.");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int num1=a;
		int num2=b;  //for Lcm becoz value will change after while loop
		
		while(a%b!=0) {
			int rem=a%b;
			a=b;
			b=rem;
			
		}
		System.out.println("GCD is: "+b);
		int gcd=b;
		int lcm;
		lcm=(num1*num2)/gcd;
		System.out.println("LCM is: "+lcm);
	}
}
