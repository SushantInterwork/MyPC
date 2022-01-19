package functionsNarrays;

public class ReverseArray {
	public static void rev(int i,int n,int[] arr) {
		for(i=0;i<=n/2+1;i++) {
			if(i==n) {
				break;
			}
		int temp=arr[i];
		arr[i]=arr[n-1];
		arr[n-1]=temp;
		n--;
		}
		for(int m=0;m<arr.length;m++) {
			System.out.print(arr[m]);      //print the array
		}
		
	}
	
	public static void main(String[] args) {
		int arr[]= {2,4,5,9,7};
	     rev(0,5,arr);
	}
}
