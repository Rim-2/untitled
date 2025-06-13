abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radious;

    public Circle(double radious) {
        this.radious = radious;
    }

    @Override
    public double area() {
        return radious * radious * Math.PI;
    }
}

class Rectangle extends Shape {
    double height;
    double width;

    public Rectangle (double height, double length) {
        this.height = height;
        this.width = length;
    }

    @Override
    public double area() {
        return height * width;
    }
}


public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];

        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(4, 5);

        for (Shape shape:shapes) {
            System.out.println(shape.area());
        }
    }
}