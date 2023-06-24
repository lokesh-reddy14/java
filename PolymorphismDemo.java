import java.util.Scanner;
abstract class Vehicle {
    protected String brand;
    protected String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract void drive();

    public String toString() {
        return brand + " " + model;
    }
}

class Car extends Vehicle {
    public Car(String brand, String model) {
        super(brand, model);
    }

    public void drive() {
        System.out.println("Driving a car: " + this.toString());
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String brand, String model) {
        super(brand, model);
    }

    public void drive() {
        System.out.println("Driving a motorcycle: " + this.toString());
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the brand of your car: ");
        String carBrand = input.nextLine();
        System.out.print("Enter the model of your car: ");
        String carModel = input.nextLine();
        Car car = new Car(carBrand, carModel);

        System.out.print("Enter the brand of your motorcycle: ");
        String motoBrand = input.nextLine();
        System.out.print("Enter the model of your motorcycle: ");
        String motoModel = input.nextLine();
        Motorcycle motorcycle = new Motorcycle(motoBrand, motoModel);

        System.out.println("Let's drive our vehicles:");
        Vehicle[] vehicles = { car, motorcycle };
        for (Vehicle v : vehicles) {
            v.drive();
        }
    }
}