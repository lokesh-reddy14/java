import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ArithmeticOp {
    char a;
    char b;

    ArithmeticOp() {
    }

    ArithmeticOp(char x, char y) {
        a = x;
        b = y;
    }

    void add() {
        int t = a + b;
        System.out.println(a + " + " + b + " = " + t);
    }
}

public class Pro22 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        char n, m;
        System.out.print("\nEnter a char for a = ");
        n = (char) br.read();
        br.readLine(); // consume the newline character
        System.out.print("\nEnter a char for b = ");
        m = (char) br.read();
        ArithmeticOp ob1 = new ArithmeticOp(n, m);
        ob1.add();
    }
}
