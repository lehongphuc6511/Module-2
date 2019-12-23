package Model.TH_Class_Animal.Foods;

import Model.TH_Class_Animal.Method.Eatting;

public abstract class Food implements Eatting {
    @Override
    public String eat() {
        return "Good";
    }
}
