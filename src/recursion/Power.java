package recursion;

class Power {
	 
	  public static int power( int n,int pow) {
		  
	   if(pow!=0) {
	    return (n* power(n, pow - 1));   
	   }
	    else {
	      return 1;
	    }
	  }
	  public static void main(String[] args) {
	      
		    int  pow = 3;
		    int n=3;
		    int result = power(n, pow);

		    System.out.println(result);
		  }

	}
