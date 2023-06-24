import java.lang.*;
import java.util.Scanner;

public class Greatest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int a,b,c;
        
        System.out.print("Value of a:");
        a=sc.nextInt();
        System.out.print("Value of b:");
        b=sc.nextInt();
        System.out.print("Value of c:");
        c=sc.nextInt();
        
        if(a>b)
        {
            if(a>c)
            {
                System.out.print("a is greater");
            }
            else
            {
                System.out.print("c is greater");
            }
        }
        else if(b>a)
        {
            if(b>c)
            {
                System.out.print("b is greater");
            }
            else
            {
                System.out.print("c is greater");
            }
        }
    }
}