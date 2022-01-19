package recursion;

public class n_to_one {
	public static void decreasing(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		decreasing(n-1);
	}
public static void main (String args[]) {
	int n=8;
	decreasing(n);
}

}

