package patterns;
import java.util.*;
public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt();
		int i,j;
		int sp=n-1; //space
		int st=1; //star  Initially
		
		for(i=1;i<=n;i++) {
			for (j=1;j<=sp;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=st;j++) {
				System.out.print("*");
			}
			System.out.println();
			sp--;
			st++;
		}
	}

}
