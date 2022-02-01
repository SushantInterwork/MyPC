package recursion;

public class FirstIndex {
	 static int count=0;
	public static void fi(int[] arr,int i,int x) {
		if(i==arr.length-1 || count==1) {
			return;
		}
		if(arr[i]==x) {
			System.out.println("found at "+i);
			count++;
		}
		fi(arr,i+1,x);
	}
	public static void main(String[] args) {
		int arr[]= {22,33,25,33,2,2,8};
		fi(arr,0,2);
	}
}
