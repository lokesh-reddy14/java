import java.util.Scanner;

class Area {
    private int length;
    private int breadth;

    public Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int returnArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        int length = input.nextInt();

        System.out.print("Enter breadth of rectangle: ");
        int breadth = input.nextInt();

        Area rectangle = new Area(length, breadth);
        int area = rectangle.returnArea();

        System.out.println("Area of rectangle: " + area);
    }
}
