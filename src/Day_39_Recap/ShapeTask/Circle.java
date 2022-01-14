package Day_39_Recap.ShapeTask;

public class Circle extends Shape {

    private double radius;

    public static double pi=3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0) {
            System.err.println("Invalid radius: " + radius);
            System.exit(1);
        }
        this.radius = radius;
    }

    public Circle(String name, double radius) {
        super(name);
        setRadius(radius);
    }
}