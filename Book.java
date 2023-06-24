import java.util.Scanner;

public class Book {
    private int code;
    private String title;
    private double price;

    public Book(int code, String title, double price) {
        this.code = code;
        this.title = title;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Code: " + code);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the code of the book: ");
        int code = scanner.nextInt();

        scanner.nextLine(); 

        System.out.print("Enter the title of the book: ");
        String title = scanner.nextLine();

        System.out.print("Enter the price of the book: ");
        double price = scanner.nextDouble();

        Book book = new Book(code, title, price);
        System.out.println("Book details:");
        book.displayDetails();
    }
}
