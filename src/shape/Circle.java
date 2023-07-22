package shape;

public class Circle implements Perimeter,Area{
    double sugar;

    public Circle(double sugar) {
        this.sugar = sugar;
    }

    @Override
    public double area() {
        return sugar * sugar * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2 * sugar * Math.PI;
    }
}
