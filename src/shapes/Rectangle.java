package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getLength() {
        return 0;
    }

    @Override
    public double getWidth() {
        return 0;
    }
//    private double length;
//    private double width;
//
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//    public double getArea(){
//        return  (this.length * this.width);
//    }
//
//    public double getPerimeter(){
//        return (2 * this.length + 2 * this.width);
//    }


}
