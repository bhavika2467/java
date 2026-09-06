class Shape {
    private String color;
    Shape(String color) {
        this.color = color;
    }
    String getColor() {
        return color;
    }
    double calculateArea(double side) {
        return side * side;
    }
    double calculateArea(double length, double breadth) {
        return length * breadth;
    }
    double calculatePerimeter(double side) {
        return 4 * side;
    }
    double calculatePerimeter(double length, double breadth) {
        return 2 * (length + breadth);
    }
    void printDetails() {
        System.out.println("Shape Color: " + color);
    }
}
class Circle extends Shape {
    private double radius;
    Circle(String color, double radius) {
        super(color);
        if (radius <= 0) {
            this.radius = 1;
        } else {
            this.radius = radius;
        }
    }
    @Override
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    @Override
    double calculatePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
    @Override
    void printDetails() {
        System.out.println("Circle");
        System.out.println("Color: " + getColor());
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea(radius));
        System.out.println("Perimeter: " + calculatePerimeter(radius));
    }
}
class Rectangle extends Shape {
    private double length;
    private double breadth;
    Rectangle(String color, double length, double breadth) {
        super(color);
        if (length <= 0) {
            this.length = 1;
        } else {
            this.length = length;
        }
        if (breadth <= 0) {
            this.breadth = 1;
        } else {
            this.breadth = breadth;
        }
    }
    @Override
    double calculateArea(double length, double breadth) {
        return length * breadth;
    }
    @Override
    double calculatePerimeter(double length, double breadth) {
        return 2 * (length + breadth);
    }
    @Override
    void printDetails() {
        System.out.println("Rectangle");
        System.out.println("Color: " + getColor());
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + calculateArea(length, breadth));
        System.out.println("Perimeter: " + calculatePerimeter(length, breadth));
    }
}
class Square extends Shape {
    private double side;
    Square(String color, double side) {
        super(color);
        if (side <= 0) {
            this.side = 1;
        } else {
            this.side = side;
        }
    }
    @Override
    double calculateArea(double side) {
        return side * side;
    }
    @Override
    double calculatePerimeter(double side) {
        return 4 * side;
    }
@Override
    void printDetails() {
        System.out.println("Square");
        System.out.println("Color: " + getColor());
        System.out.println("Side: " + side);
        System.out.println("Area: " + calculateArea(side));
        System.out.println("Perimeter: " + calculatePerimeter(side));
    }
}
public class ShapeManagementApp {
       public static void main(String[] args) {
        Circle circle = new Circle("Red", 5);
        Rectangle rectangle = new Rectangle("Blue", 10, 6);
        Square square = new Square("Green", 4);
        circle.printDetails();
        System.out.println();
        rectangle.printDetails();
        System.out.println();
        square.printDetails();
        Shape shape = new Shape("Yellow");
        System.out.println("Area of square: " + shape.calculateArea(5));
        System.out.println("Area of rectangle: " + shape.calculateArea(10, 6));
        System.out.println("Perimeter of square: " + shape.calculatePerimeter(5));
        System.out.println("Perimeter of rectangle: " + shape.calculatePerimeter(10, 6));
double totalArea =circle.calculateArea(5)+ rectangle.calculateArea(10, 6)+ square.calculateArea(4);
        System.out.println("Total Area = " + totalArea);
        double averageArea = totalArea / 3;
        System.out.println("Average Area = " + averageArea);
    }
}