import java.util.Scanner;

class Shape {
    double length;
    double width;
    double height;
    
    public Shape() {
        this.length = 0;
        this.width = 0;
        this.height = 0;
    }
    
    public Shape(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
}

class Test1 extends Shape {
    public Test1() {
        super();
    }
    
    public Test1(double length, double width, double height) {
        super(length, width, height);
    }
    
    @Override
    public void calculate() {
        double volume = length * width * height;
        System.out.println("Volume of the shape is " + volume);
    }
}

public class Shape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        
        Test1 test1 = new Test1(length, width, height);
        test1.calculate();
    }
}
