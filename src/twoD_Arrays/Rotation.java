package twoD_Arrays;

import java.util.Scanner;

public class Rotation {
	public static void main(String[] args)  {
	    Scanner scn = new Scanner(System.in);
	    System.out.println("enter size of row and col");
	    int n = scn.nextInt();
	    int[][] arr = new int[n][n];
	    for (int i = 0; i < arr.length; i++) {
	    	System.out.println("enter elements of"+i+"row");
	      for (int j = 0; j < arr[0].length; j++) {
	        arr[i][j] = scn.nextInt();
	      }
	    }
	    //transpose
	    for (int i = 0; i < arr.length; i++) {
	    	 for (int j = i; j < arr[0].length; j++) { //j=i to avoid double swapping
	    		 int temp=arr[i][j];
	    		 arr[i][j]=arr[j][i];
	    		 arr[j][i]=temp;
	    	 }
	    }
	    
	    //reversing the rows
	    for(int i=0;i<arr.length;i++) {
	    	int li=0;				//left index
	    	int ri=arr.length-1; 	//right index
	    	while(li<ri) {
	    	int	temp=arr[i][li];
	    		arr[i][li]=arr[i][ri];
	    		arr[i][ri]=temp;
	    		
	    		li++;
	    		ri--;
	    	}
	    }
	    
	    //display
	    for (int i = 0; i < arr.length; i++) {
	      for (int j = 0; j < arr[0].length; j++) {
	       System.out.print(arr[i][j]+" ");
	      }
	      System.out.println();
	    }
	    
  }
}
