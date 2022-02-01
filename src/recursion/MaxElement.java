package recursion;

public class MaxElement {
	static int m;
	public static int max(int i,int[] arr) {
		if(i==arr.length-2) {
			return 0;
		}
	if(arr[i+1]>arr[i]) {
		 m=arr[i+1];
	}
	 max(i+1,arr);
	 return m;
		
	}
	public static void main(String[] args) {
		int arr[]= {22,33,25,59,2};
	     int ans=max(0,arr);
	     System.out.println(ans);
	}
}
