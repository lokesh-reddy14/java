import java.lang.*;
import java.util.Scanner;

class A {
    int a;
    
    A(int x) {
        a = x;
    }
    
    void display() {
        System.out.println("From class A: a = " + a);
    }
}

class B extends A {
    int b;
    
    B(int x, int y) {
        super(x);
        b = y;
    }
    
    void display() {
        System.out.println("From class B: a = " + a);
        System.out.println("From class B: b = " + b);
    }
    
    void sum() {
        int t = a + b;
        System.out.println("Sum from class B: sum = " + t);
    }
}
class C extends B
{int c,int s;
 C(int n,int m,int p){super(n,m);c=p;s=a+b+c;}
 void display(){System.out.println("From class C: a="+a);
                System.out.println("From class C: b="+b);
                System.out.println("From class C: c="+c);
                System.out.println("From class C: s="+s);
 }
}

public class ProABC {
    public static void main(String[] args) 
{int u,v; Scanner sc=new Scanner(System.in);
 System.out.println("Enter 2 values:");
 u=sc.nextInt();v=sc.nextInt();
        B ob1 = new B(u ,v);
        ob1.display();
        ob1.sum();
        C ob2 = new c(11,22,33);ob2.display();
    }
}
