package functionsNarrays;

import java.util.Scanner;

public class Base2Base {
	   
		public static int D2B(int n,int b) {
			int converted=0;
			int power=1;
			while(n>0) {
			int rem=n%b;
			    n=n/b;
			
			   converted+=rem*power;
			   power*=10;
			
			}
			return converted;
		}
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b1=sc.nextInt();
		int b2=sc.nextInt();
		int val=D2B(n,b1);   			//convert in b1
		System.out.println(D2B(val,b2));//convert b1 in b2 and print
	}

}
