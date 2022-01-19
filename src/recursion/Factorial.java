package recursion;

public class Factorial {
	static int temp=1;
	public static int factorial(int n) {
		if(n==0)
			return 0;
		
		 temp=temp*n;
		 factorial(n-1);
		 return temp; 
	}
	public static void main(String[] args) {
		int n=5;
		int ans=factorial(n);
		System.out.println(ans);

	}

}
