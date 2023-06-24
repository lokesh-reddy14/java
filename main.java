import java.lang.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        
        String name,reve;
        int i,j;
        char ch;
        
        name=sc.next();
        reve="";
        
        for(i=0;i< name.length();i++)
        {
            
            for(j=0;j<=i;j++)
            {
                ch=name.charAt(j);
                System.out.print(""+ch);
            }
      
            System.out.println("");
        }
        
    }
}