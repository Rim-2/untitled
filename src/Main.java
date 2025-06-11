class Car {
    String brand;
    int year;

    public Car() {
    }

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Car brand: " + brand + ", year: " + year);
    }
}


public class Main {
    public static void main(String[] args) {
        Car car = new Car("현대", 2024);
        car.displayInfo();
    }
}