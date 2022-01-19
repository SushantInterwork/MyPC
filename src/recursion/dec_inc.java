package recursion;

public class dec_inc {
	public static void inc_dec(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		inc_dec(n-1);
		System.out.println(n);
	}
public static void main (String args[]) {
	int n=8;
	inc_dec(n);
}

}
