package functionsNarrays;

public class RotateArray {
	public static int[] reverse(int[] arr,int i,int j) {
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		return arr;
	}
	public static void rotate(int k ,int[] arr) {
		reverse(arr,0,arr.length-k-1);
		reverse(arr,arr.length-k,arr.length);
		int answer[]=reverse(arr,0,arr.length);
		for(int m=0;m<answer.length;m++) {
			System.out.print(answer[m]);      //print the array
		}
		}
	
	public static void main(String[] args) {
		int arr[]= {2,4,5,9,7};
	     rotate(2,arr);
	}
	
}
