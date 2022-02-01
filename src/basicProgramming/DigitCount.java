package basicProgramming;
import java.util.Scanner;

public class DigitCount {
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter your no.");
	 int n=sc.nextInt();
	 int dgt=0;
	 while(n!=0){
		 n=n/10;
		 dgt++;
	 }
	 System.out.println("no. of digits "+dgt);
 }
}
