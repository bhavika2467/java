/*57. APPLICATION 1 - SHAPE MANAGEMENT
------------------------------------
Required filename: ShapeManagementApp.java
Purpose:
Build a shape-processing application where one Shape array processes several
shape types through abstract methods.
Common evidence required in every solution:
- An abstract Shape base class with at least one private common field.
- Abstract methods for area and perimeter.
- At least three concrete Shape subclasses selected by the student. Choices
    may include Circle, Rectangle, Square, Triangle, or another valid 2D shape.
- Positive dimensions protected by constructors or methods.
- Constructors that use super(...).
- Correct @Override implementations for area and perimeter.
- A Shape[] containing at least five mixed objects.
- One loop that displays every shape through Shape references.
- Calculation of total area through polymorphic calls.
- A useful toString() somewhere in the hierarchy.
Choose any two application features:
- calculate average area or total perimeter
- find the shape with the largest or smallest area
- count objects by runtime shape type
- search using a common String property such as color or label
- safely call a subtype-specific method using instanceof
- add a fourth shape type
Student design choices:
- the three or more concrete shape types
- the common field and additional fields
- dimension representation and validation approach
- which two features to implement
- helper methods, report organization, and displayed text
The marker will look for a meaningful abstract base class, correct formulas,
constructor chaining, at least three concrete implementations, a mixed Shape[]
and runtime dispatch. All students do not need to use Circle, Rectangle, and
Triangle together.*/
abstract class Shape {
     private String color;
    Shape(String color) {
        this.color = color;
    }
    String getColor() {
        return color;
    }
    protected double area;
    protected double perimeter;
    abstract protected double area();
    abstract protected double perimeter();
    double getarea() {
        return area;
    }
    double getperimeter() {
        return perimeter;
    }
}