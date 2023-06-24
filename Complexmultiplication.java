import java.util.Scanner;

public class Complexmultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("");
        int real1 = sc.nextInt();
        System.out.print(" ");
        int imag1 = sc.nextInt();

        System.out.print(" ");
        int real2 = sc.nextInt();
        System.out.print("");
        int imag2 = sc.nextInt();

        int realResult = (real1 * real2) - (imag1 * imag2);
        int imagResult = (real1 * imag2) + (imag1 * real2);

        System.out.println("Result=" + realResult + " + " + imagResult + "i");
    }
}