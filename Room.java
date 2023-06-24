import java.util.Scanner;

class Room {
    private float length;
    private float breadth;
    private float height;

    public Room(float length, float breadth, float height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public float volume() {
        return length * breadth * height;
    }

    public void display() {
        System.out.println("volume=" + volume());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float length = scanner.nextFloat();
        float breadth = scanner.nextFloat();
        float height = scanner.nextFloat();
        Room room = new Room(length, breadth, height);
        room.display();
    }
}
