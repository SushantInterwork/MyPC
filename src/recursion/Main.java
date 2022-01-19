package recursion;

public class Main {
	static int a=0;
    static int b=1;


	public static void Fib(int n) {
		if(n>0) {
			System.out.println(a);
		int c=a+b;
		a=b;
		b=c;
		
		Fib(n-1);
		}
		
	}
	public static void main(String[] args) {
		Fib(5);
	}

}




/*void fun2(int n)
{
if(n ==0)
    return;
  
fun2(n/2);
System.out.println(n%2);
}

int fun1(int n)
{
    if (n ==1)
        return 0;
    else
        return 1 + fun1(n /2);
}*/
