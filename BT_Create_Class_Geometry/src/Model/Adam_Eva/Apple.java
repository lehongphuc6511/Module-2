package Model.Adam_Eva;

public class Apple {
    private double weight;

    public Apple(){}

    public Apple(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double delete(){
        return this.weight--;
    }

    @Override
    public String toString() {
        return "Apple = " + "weight : " + weight;
    }
}
