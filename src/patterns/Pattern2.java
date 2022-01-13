package patterns;
import java.util.*;
public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=n;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}

}

