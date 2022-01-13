package patterns;
import java.util.*;
public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt();
		int i,j;
		int sp=n/2; //space
		int st=1; //star  Initially
		
		for(i=1;i<=n;i++) {
			for (j=1;j<=sp;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=st;j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<=n/2) {
				sp--;
				st=st+2;	
			}
			else {	sp++;
			st=st-2;	}
				
		}
	}

}
