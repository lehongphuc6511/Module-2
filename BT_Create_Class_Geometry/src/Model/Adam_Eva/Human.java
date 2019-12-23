package Model.Adam_Eva;

public class Human {
    private String name;
    private String gender;
    private float weight = 0;
    private int minus;

    public Human(){}

    public Human(String name, String gender, float weight) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public double increase(){
        return this.weight ++;
    }

    @Override
    public String toString() {
        return  "\n" +
                "Name : " + name + "\n" +
                "Gender : " + gender + "\n" +
                "Weight : " + weight ;
    }
}
