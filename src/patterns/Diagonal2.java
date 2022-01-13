package patterns;
import java.util.*;
public class Diagonal2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				if(i+j==n+1) {
				System.out.print("* ");
				}
				else {System.out.print(" ");}
			}
			System.out.println();
		}
	}

}
