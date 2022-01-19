package recursion;

public class one_to_n {
	public static void decreasing(int n) {
		if(n==0) {
			return;
		}
		decreasing(n-1);
		System.out.println(n);
	}
public static void main (String args[]) {
	int n=8;
	decreasing(n);
}

}
