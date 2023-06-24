public class VariableLengthArguments {
    public static void main(String[] args) {
        int sum1 = sum(1, 2, 3);                // Calling sum() with three arguments
        int sum2 = sum(1, 2, 3, 4, 5, 6);       // Calling sum() with six arguments

        System.out.println("Sum of 1, 2, and 3 is: " + sum1);
        System.out.println("Sum of 1, 2, 3, 4, 5, and 6 is: " + sum2);
    }

    public static int sum(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
