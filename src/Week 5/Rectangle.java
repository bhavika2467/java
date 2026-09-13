class Rectangle extends Shape {
    private double length;
    private double width;
    Rectangle(String color, double length, double width) {
        super(color);
        if (length <= 0 || width <= 0) {
            System.out.println("Length and width must be positive");
        }
        this.length = length;
        this.width = width;
    }
    @Override
    protected double area() {
        area = length * width;
        return area;
    }
    @Override
    protected double perimeter() {
        perimeter = 2 * (length + width);
        return perimeter;
    }
    public void printDetails() {
    System.out.println("Rectangle - Color: " + getColor() + ", Length: " + length+ ", Width: " + width);
}
}

