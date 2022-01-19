package functionsNarrays;

import java.util.Scanner;

public class SumOfArrays {
	public static void add(int[] arr1,int[] arr2) {
		int arr3[]=new int[5];
		int sum=0;
		int c=0;
		int i=4;    //i is pointing arr1
		int j=4;	//j is pointing arr2 and k is pointing arr3
				for(int k=4;k>=0;k--) {
					if(i>0 && j>0 && k>0) {
					 sum=arr1[i]+arr2[j]+c;
					arr3[k]=sum%10;
					 c=sum/10;
					} 
					else if(i==0 && j==0) {
						 sum=arr1[i]+arr2[j]+c;
						arr3[k]=sum;
						break;
					}	
					i--;
					j--;
				}		
		
		for(int m=0;m<arr3.length;m++) {
			System.out.print(arr3[m]);      //print the addition
		}
		
	}
	public static void main(String[] args) {
		int arr1[]= {2,5,6,7,8};
		int arr2[]= {9,4,5,6,7};
		add(arr1,arr2);
		}
}
