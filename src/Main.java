
class Car {
    String brand;
    int year;
    int number;
    String color;

    public Car() {
    }

    public Car(String brand, int year, int number, String color) {
        this.brand = brand;
        this.year = year;
        this.number = number;
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Car brand: " + brand + ", year: " + year + ", number: " + number + ", color: " + color);
    }
}


public class Main {
    public static void main(String[] args) {
        Car car = new Car("현대", 2024, 9212, "검정색");
        car.displayInfo();
    }
}