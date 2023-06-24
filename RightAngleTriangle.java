import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String str = "GITAM";
        int n = str.length();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(str.charAt(j-1) + " ");
            }
            System.out.println();
        }
    }
}
