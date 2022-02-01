package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class StairPath {
	public static ArrayList<String> getPath(int n) {
		if(n==0) {
			ArrayList<String> nullvalue=new ArrayList<String>();
			nullvalue.add(" ");
			return nullvalue;
		}
		if(n<0) {
			ArrayList<String> nothing=new ArrayList<String>();
			return nothing;
		}
		ArrayList<String> path1=getPath(n-1);
		ArrayList<String> path2=getPath(n-2);
		ArrayList<String> path3=getPath(n-3);
		ArrayList<String> answer=new ArrayList<String>();
		
		for(String temp:path1) {
			answer.add(1+temp);
		}
		for(String temp:path2) {
			answer.add(2+temp);
		}
		for(String temp:path3) {
			answer.add(3+temp);
		}
		return answer;		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<String> Paths=getPath(n);
		System.out.println(Paths);
		
	}

}
