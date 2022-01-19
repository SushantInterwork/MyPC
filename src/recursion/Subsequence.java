package recursion;

import java.io.*;

import java.util.*;

public class Subsequence {
	public static ArrayList< String> gss( String str){
		if(str.length()==0) {
			ArrayList< String> nothing=new ArrayList< String>();
			nothing.add(" ");
			return nothing;
		}
		char ch= str.charAt(0);
		String ros=str.substring(1);
		
		ArrayList< String> resultant=gss(ros);
		ArrayList< String> answer= new ArrayList< String>();
		for(String temp:resultant) {
		answer.add(" "+temp);
		}
		for(String temp:resultant) {
			answer.add(ch+temp);
			}
		return answer;
	}


  public static void main(String[] args)  {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    ArrayList< String> result = gss(str);
    System.out.println(result);
  }
}

 