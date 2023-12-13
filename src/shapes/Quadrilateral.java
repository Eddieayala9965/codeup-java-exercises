package shapes;

public class Quadrilateral extends Shape implements Measurable {
    private double length;
    private double width;

    public Quadrilateral(double length, double width){

    }

    @Override
    public double getLength() {
        return 0;
    }

    @Override
    public double getWidth() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return (this.length * this.width);
    }

    @Override
    public double getArea() {
        return (2 * this.length + 2 * this.width);
    }
}
