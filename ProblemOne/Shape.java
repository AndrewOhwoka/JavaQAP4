package ProblemOne;
public abstract class Shape {
    public String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double computePerimeter();
    public abstract double computeArea();

    @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + computeArea() + ", Perimeter: " + computePerimeter();
    }
}
