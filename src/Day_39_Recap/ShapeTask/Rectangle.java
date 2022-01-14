package Day_39_Recap.ShapeTask;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle( double length, double width) {
        super("Rectangle");
        setWidth(width);
        setLength(length);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length<=0) {
            System.err.println("Invalid side: " + length);
            System.exit(1);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<=0) {
            System.err.println("Invalid side: " + width);
            System.exit(1);
        }
        this.width = width;
    }

    public double area(){
        return width*length;
    }

    public double perimeter(){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area= " + area() +'\''+
                ", perimeter= " + perimeter() +'\''+
                '}';
    }
}
