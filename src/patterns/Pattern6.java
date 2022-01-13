package patterns;
import java.util.*;
public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt();
		int i,j;
		int st=n/2+1;
		int sp=1;
		for(i=1;i<=n;i++) {
			
			for(j=1;j<=st;j++) {
				System.out.print("*");
			}
			for (j=1;j<=sp;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=st;j++) {
				System.out.print("*");
			}
			
			System.out.println();
			if(i<=n/2) {
				st--;
				sp+=2;
			}
			else {	
			st++;
			sp-=2;}
				
		}
	}

}
