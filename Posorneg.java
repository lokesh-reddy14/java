import java.lang.*;
import java.util.Scanner;

public class Posorneg
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        num=sc.nextInt();
        
        if(num>0)
        {
            System.out.print("Number is postive ");
        }
        else if( num == 0)
        {
            System.out.print("Number is '0'");
        }
        else
        {
            System.out.print("Number is negtive ");
        }
    }
}