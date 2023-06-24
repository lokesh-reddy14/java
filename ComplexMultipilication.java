import java.lang.*;
import java.io.*;
public class SumAndAvg
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int Number[]=new int[3];
        int i,Sum;
        float Average;
        Sum=0;
        String m;
        System.out.print("");
        for(i=0;i<=2;i++)
        {
            m=br.readLine();
            Number[i]=Integer.parseInt(m);
        }
        for(i=0;i<=2;i++)
        {
            Sum=Sum+Number[i];
        }
        System.out.println("Sum="+Sum);
        Average=(float)Sum/3;
        System.out.println("Avg="+Average);
    }
}