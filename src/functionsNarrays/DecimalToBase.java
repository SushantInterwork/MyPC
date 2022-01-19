package functionsNarrays;

import java.util.Scanner;

public class DecimalToBase {
	   
		public static void D2B(int n,int b) {
			int converted=0;
			int power=1;
			while(n>0) {
			int rem=n%b;
			    n=n/b;
			
			   converted+=rem*power;
			   power*=10;
			
			}
			System.out.println(converted);
		}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b=sc.nextInt();
		D2B(n,b);
	}

}
