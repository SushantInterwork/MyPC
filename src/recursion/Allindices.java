package recursion;

public class Allindices {
	public static void ai(int[] arr,int i,int x) {
		if(i==arr.length-1) {
			return;
		}
		if(arr[i]==x) {
			System.out.println("found at "+i);
		}
		ai(arr,i+1,x);
	}
	public static void main(String[] args) {
		int arr[]= {22,33,25,33,2,2,8};
		ai(arr,0,33);
	}
}
