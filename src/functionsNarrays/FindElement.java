package functionsNarrays;

import java.util.Scanner;

public class FindElement {
	
	public static void find(int[] arr,int d) {
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==d) {
				System.out.println("found at index "+i);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int d=sc.nextInt();
		find(arr,d);
	
	}
}
