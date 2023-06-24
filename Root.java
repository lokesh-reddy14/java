import java.lang.*;
import java.util.Scanner;

public class Root
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int a,b,c;
        
        double d,r1,r2;
        
        System.out.print("Value of a:");
        a=sc.nextInt();
        System.out.print("Value of b:");
        b=sc.nextInt();
        System.out.print("Value of c:");
        c=sc.nextInt();
        
        d=(b*b)- 4*a*c;
        
        if(d>0.0)
        {
            r1=(-b + (Math.pow(d,0.5)) / 2*a);
            
            r2=(-b - (Math.pow(d,0.5)) / 2*a);
            System.out .println("root1:"+r1);
            System.out .print("root2:"+r2);
            
        }
        else if (d==0.0)
        {
            r1= -b/2*a;
            System.out .print("root1:"+r1);
            
        }
        else
        {
            System.out .print(" No real roots");
            
        }
        
    }
}