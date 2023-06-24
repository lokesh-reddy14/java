class IfElseTest
{
  public static void main(String args[])
  {
   int num[]={50,65,56,71,81};
   int even=0,odd=0;
   for (int i=0;i<num.length;i++)
    {
     if ((num[i] % 2)==0)
     {
       even+=1;
     }
     else
     {
       odd +=1;
      }
    }
    System.out.println("Even Numbers:"+even); 
    System.out.println("Odd Numbers:"+odd);
  }
}