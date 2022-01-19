package functionsNarrays;

public class Inverse {
	public static void inv(int[] arr) {
		int[] answer=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int x=arr[i];
			answer[x]=i;
		}
		for(int m=0;m<answer.length;m++) {
			System.out.print(answer[m]);      //print the array
		}
	}
	public static void main(String[] args) {
		int arr[]={4,0,2,3,1};
	     inv(arr);
	}
}
