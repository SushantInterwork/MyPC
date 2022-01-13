package patterns;
import java.util.*;
public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt();
		int i,j;
		int sp=0; //space
		int st=n; //star  Initially
		
		for(i=1;i<=n;i++) {
			for (j=1;j<=sp;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=st;j++) {
				System.out.print("*");
			}
			System.out.println();
			sp++;
			st--;
		}
	}

}
