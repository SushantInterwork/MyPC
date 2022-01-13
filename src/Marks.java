import java.util.*;

public class Marks {
	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);      
		 System.out.println("Enter the marks");
//		    String i = sc.nextLine(); for string input
		 int i = sc.nextInt();
		 if(i>90) {
			 System.out.println("Excellent");}
			 else if(i>80 && i<=90)
			 {System.out.println("good");}
			 else if(i>70 && i<=80)
			 {System.out.println("fair");}
			 else if(i>60 && i<=70)
			 {System.out.println("meet expectations");}
			
			 else if(i <=60)
			 {System.out.println("below par");}
		    
	}
	
}
