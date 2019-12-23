package Model.Class_Geometry;

public class Square {
    private double edge;

    public Square(){}

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public Square(double edge) {
        this.edge = edge;
    }

    @Override
    public String toString() {
        return "Edge =" + edge;
    }
}
