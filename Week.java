import java.lang.*;
import java.util.Scanner;

public class Week
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int num,res;
        
        System.out.print("Enter the number:");
        num=sc.nextInt();
        
        if(num>7)
        {
            res=num%7;
        }
        else
        {
            res=num;   
        }
        if(res==1)
        {
            System.out.print("Sunday");
        }
        else if(res==2)
        {
            System.out.print("Monday");
        }
        else if(res==3)
        {
            System.out.print("Tuesday");
        }
        else if(res==4)
        {
            System.out.print("Wednesday");
        }
        else if(res==5)
        {
            System.out.print("Thursday");
        }
        else if(res==6)
        {
            System.out.print("Friday");
        }
        else if(res==7)
        {
            System.out.print("Saturday");
        }
        else 
        {
            System.out.print("No vaild");
        }
    }
}