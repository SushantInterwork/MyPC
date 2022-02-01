package basicProgramming;
import java.util.*;
public class primeno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of elements you want to check");
		int t= sc.nextInt();
		int arr[]=new int[t];
		System.out.println("enter the nos.");
		for(int i=0;i<t;i++) {
		  arr[i]=sc.nextInt();	
		}
		
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
		for (int j = 2; j <= num / 2; ++j) {
			if(num%j==0) 
			flag=true;
			break;
		}
		 if (!flag)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		}
		
	}

}
