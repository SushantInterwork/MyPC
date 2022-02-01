package recursion;

public class LastIndex {
	 static int count=0;
	public static void li(int[] arr,int j,int x) {
		if(j==0 || count==1) {
			return;
		}
		if(arr[j]==x) {
			System.out.println("found at "+j);
			count++;
		}
		li(arr,j-1,x);
	}
	public static void main(String[] args) {
		int arr[]= {22,33,25,3,2,3,8};
		li(arr,arr.length-1,3);
	}
}
