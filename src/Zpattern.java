
import java.util.*;
public class Zpattern 
{    
    public static void main(String args[])   
    {   
    // taking variable for loop iteration and row .
    int row,r,c,d ;
    //creating object 
    Scanner sc = new Scanner(System.in);
    // entering the number of row
    System.out.print("Enter rows : ");
    row = sc.nextInt();
    d=row-1;
    //outer for loop 
   for (r = 0; r < row; r++) 
    {
        for (c = 0; c < row ; c++)
        {
            if (r == 0 || r == row  - 1 || c == d)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        d--;
        System.out.print("\n");
    }
    }
}