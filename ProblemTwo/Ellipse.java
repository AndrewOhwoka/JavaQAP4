package ProblemTwo;

public class Ellipse extends Shape {
    private double a, b;

    public Ellipse(double a, double b) {
        super("Ellipse");
        if (a < b) {
            double temp = a;
            a = b;
            b = temp;
        }
        this.a = a;
        this.b = b;
    }

    @Override
    public double computePerimeter() {
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    @Override
    public double computeArea() {
        return Math.PI * a * b;
    }

    @Override
    public void scale(double factor) {
        a *= factor;
        b *= factor;
    }
}
