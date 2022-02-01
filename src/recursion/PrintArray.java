package recursion;

public class PrintArray {
	public static void print(int[] arr,int i) {
		if(i==arr.length) {
			return;
		}
		System.out.println(arr[i]);
		print(arr,i+1);
	}
	public static void main(String args[]) {
		int arr[]= {2,3,4,5,67,8};
		print(arr,0);
	}
}
