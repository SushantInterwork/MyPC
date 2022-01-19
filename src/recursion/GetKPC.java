package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetKPC {
	  static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx","yz"}; 
	  
	  public static ArrayList< String> kpc(String str){
		  if(str.length()==0) {				//base case
				ArrayList< String> nothing=new ArrayList< String>();
				nothing.add(" ");				
				return nothing;
			}
		  
		  char ch=str.charAt(0);
		  String rest=str.substring(1);		
		  
		  ArrayList< String> resultant=kpc(rest);		//func call
		  ArrayList< String> answer=new  ArrayList< String>();
		  
		  String s=codes[ch];
		  for(int i=0;i<s.length();i++) {
			  
			  for(String temp:resultant) {
				  answer.add(s.charAt(i)+temp);
			  }
		  }
		  return answer;
	  }
	public static void main(String[] args)  {
	    Scanner scn = new Scanner(System.in);
	    String str = scn.next();
	   ArrayList< String> result = kpc(str);
	
}
}
