package shape;

public class Square implements Perimeter, Area{

    double side;

    public Square(double sideA) {
        this.side = sideA;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}
