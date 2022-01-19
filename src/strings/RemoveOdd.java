package strings;

import java.util.ArrayList;
import java.util.Collection;

public class RemoveOdd {
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>() ;
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(7);
		for(int i=arr.size()-1;i>=0;i--) {
			if(arr.get(i)%2!=0) {
				arr.remove(i);
			}
			
		}
		System.out.println(arr);
	}
}
