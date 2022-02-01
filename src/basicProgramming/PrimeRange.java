package basicProgramming;
import java.util.Scanner;

public class PrimeRange {
 
    public static void main(String[] args) {
        //range
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter start range value");
    	int min= sc.nextInt();
    	System.out.println("enter end range value");
    	int max= sc.nextInt();
        for(int n=min;n<=max;n++) {
            //check if this number is prime
            if(isPrime(n)) {
                System.out.println(n);
            }
        }
    }
     
    public static boolean isPrime(int num) {    
        for(int i = 2; i <= num/i; ++i) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}