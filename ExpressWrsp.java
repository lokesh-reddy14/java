//Expressions

class ExpressWrap
{
    public static void main(String args[])
   {
       int a=10,b=5,c=8,d=2;
       float x=6.4F,y=3.0F;

       int answer1=a*b+c/d;
       int answer2=a*(b+c)/d;

       float answer5=a/y;
       int answer6=a%c;
       float answer7=x%y;
  
        boolean boo11=a>b && c>d;
        boolean bo012=a<b &&c>b;
        boolean boo13=a<b || c>d;
        boolean boo14=!(a-b==c);
        
         System.out.println("order of Evaluation");
         System.out.println("a*b+c/d="+answer1);
         System.out.println("a*(b+c)/d="+answer2);

          System.out.println("Type Conversion");
          System.out.println("a/c="+answer3);
          System.out.println("(float) a/c="+answer4);
          System.out.println("a/y="+answer5);
   
          System.out.println("Modulo Operations");
          System.out.println("a%c="+answer6);
          System.out.println("x%y="+answer7);

          System.out.println("Logi cal Operations");
          System.out.println("a>b && c>d=" + boo11);
          System.out.println("a<b && c>d="  +boo12);
          System.out.println("a<b || c>d="  +boo13);
          System.out.println("! (a-b==c)+" +b0014);
   }
}