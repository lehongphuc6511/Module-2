package Model.Class_Geometry;

public class Circle {
    private double radius;
    public Circle(){}

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Radius =" + radius;
    }
}
