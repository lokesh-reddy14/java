import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = input.nextInt();

        char grade;
        if (marks >= 90) {
            grade = 'O';
        } else if (marks >= 80 && marks <= 89) {
            grade = 'A';
        } else if (marks >= 70 && marks <= 79) {
            grade = 'B';
        } else if (marks >= 60 && marks <= 69) {
            grade = 'C';
        } else if (marks >= 50 && marks <= 59) {
            grade = 'D';
        } else if (marks >= 40 && marks <= 49) {
            grade = 'P';
        } else {
            grade = 'F';
        }

        System.out.println("Your grade is: " + grade);
    }
}
