/*
62. TASK 3 - RECTANGLE MODEL
----------------------------
Required filename: RectangleModel.java
Create a Rectangle class and a public RectangleModel driver.
Requirements:
- private double width and height
- no-argument constructor creating a 1 by 1 rectangle
- one-argument constructor creating a square
- two-argument constructor creating a rectangle
- use this(...) constructor chaining
- positive dimensions only
- getArea(), getPerimeter(), isSquare(), and scale(double factor)
- overloaded area methods only if their responsibilities are clearly stated
- useful toString()
Trace the constructor call order for all three construction forms. */
class Rectangle {
    private double width;
    private double height;
    public Rectangle() {
        this(1, 1);
        System.out.println("No-argument constructor called");
    }
    public Rectangle(double side) {
        this(side, side);
        System.out.println("One-argument constructor called");
    }
    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException(
                "Width and height must be positive"
            );
        }
        this.width = width;
        this.height = height;
        System.out.println("Two-argument constructor called");
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }
    public boolean isSquare() {
        return width == height;
    }
    public void scale(double factor) {
        width = width * factor;
        height = height * factor;
    }
public void print() {
    System.out.println("Width: " + width);
    System.out.println("Height: " + height);
    System.out.println("Area: " + getArea());
    System.out.println("Perimeter: " + getPerimeter());
    System.out.println("Square: " + isSquare());
}
}
public class RectangleModel {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        Rectangle r2 = new Rectangle(5);
        System.out.println(r2);
        Rectangle r3 = new Rectangle(4, 6);
        System.out.println(r3);
        r3.scale(2);
        System.out.println(r3);
    }
}
