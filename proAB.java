// Demo of interface and multiple inheritnace

import java.lang.*;
import java.util.Scanner;

interface InA
{ final int ia=4;
   void display();
  }

interface InB
{ int ib=5;
   void sum();
  }
class A implements InA, InB
{ public void display(){ System.out.println("From A: ia = "+ia);}
   public void sum() { System.out.println("Sum = " + (ia+ib));}
  }

public class proAB
{ public static void main (String[] args)
   { A obj1 = new A(); obj1.display(); obj1.sum();
     }
}