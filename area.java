import java.lang.*;
import java.util.Scanner;

class Box
{
 int p1;
 int p2;
 int area;
 Box(int x){p1=x;}
 Box(int x,int y){p1=x;p2=y;}
 Box(Box eob){this.p1=eob.p1;this.p2=eob.p2;}
 void add(int a){p1=p1+a;}
 void add(int a.int b){p1=p1+a;p2=p2+b;}
 int area1(){area=p1*p1;return area;}
 int area2(){area=p1*p2;return area;}
 void display()
 System.out.println("Area="+area);
}
public class ProBox
{Box ob1;//
ob1=new Box(5)//ob1 is a reference of Box object
Box ob11=new Box(ob1)
}