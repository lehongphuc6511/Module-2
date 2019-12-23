package Model.Class_Geometry;

public class Rectangle {
    private double width;
    private double heigth;

    public Rectangle(){}

    public Rectangle(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    @Override
    public String toString() {
        return "Width =" + width + "and" + "heigth" + heigth;
    }
}
