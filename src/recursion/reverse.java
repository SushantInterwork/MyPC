package recursion;

public class reverse {
	public static void rev(int i, int n, int [] arr)
	{
	   if(i==n)
	   {
	     return ;
	   } 
	   else
	   {
	     rev(i+1, n, arr);
	     System.out.println(arr[i]);
	   }
	}
	public static void main(String[] args) {
		int arr[]= {2,3,5,6,7};
	     rev(0,5,arr);

	}

}

