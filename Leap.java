import java.lang.*;
import java.util.Scanner;

public class Leap
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int res;
        
        System.out.print("Enter the number:");
        res=sc.nextInt();
        
        
        if ((res % 400 == 0) || ((res % 4 == 0) && (res % 100 != 0))) 
        {
            System.out.println("Leap year.");
        }
        else
        {
            System.out.println("Not leap year.");
        }
    }
}