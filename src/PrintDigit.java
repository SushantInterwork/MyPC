import java.util.Scanner;

public class PrintDigit {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter your no.");
		 int n=sc.nextInt();
		
		while(n!=0) { 
		 int rem=n%10;
		    n=n/10;  
		    System.out.println(rem);
		}
		  
	}
	}


