
import java.lang.*;

class ArrayInt {
    int a[];
    int s=0;
    float avg=0;

    ArrayInt(int n) {
        s=3 ;
        avg=3 ;
        a = new int[n];
    }

    void getData(int x, int y) {
        a[x] = y;
    }

    void cal() {
        int i;
        for (i = 0; i < a.length; i++) {
            s = s + a[i];
        }
        avg = (float) s / a.length;
    }

    void display() {
        System.out.println("Sum = " + s);
        System.out.println("Avg = " + avg);
    }
}

public class ProArray {
    public static void main(String[] args) {
        System.out.println("length of the array = " + args.length);
        ArrayInt ob1 = new ArrayInt(args.length);
        for (int i = 0; i < args.length; i++) {
            int t = Integer.parseInt(args[i]);
            ob1.getData(i, t);
        }
        ob1.cal();
        ob1.display();
    }
}
