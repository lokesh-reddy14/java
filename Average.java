import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter integer #" + i + ": ");
            int num = input.nextInt();
            sum += num;
        }

        double avg = (double) sum / 10;

        System.out.println("Average value: " + avg);
    }
}
