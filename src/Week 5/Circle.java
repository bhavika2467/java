class Circle extends Shape {
    private double radius;
    Circle(String color, double radius) {
        super(color);
        if (radius <= 0) {
           System.out.println("Radius must be positive");
        }
        this.radius = radius;
    }
    @Override
    protected double area() {
        area = Math.PI * radius * radius;
        return area;
    }
    @Override
    protected double perimeter() {
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
   public void printDetails() {
    System.out.println("Circle - Color: " + getColor() + ", Radius: " + radius);
}
}
