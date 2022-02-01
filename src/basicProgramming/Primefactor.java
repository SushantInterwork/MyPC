package basicProgramming;
import java.util.Scanner;

public class Primefactor {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter you no.");
		int n=sc.nextInt();
		for (int div=2;div*div<=n;div++) {  //divisor
			while(n%div==0) {
				n=n/div;
				System.out.println(div);
			}
			if(n!=1) {
				System.out.println(n);
			}
		}
	}
}
