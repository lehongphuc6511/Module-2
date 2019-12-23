package Model.TH_Class_Animal.Animal;

import Model.TH_Class_Animal.Method.Eatting;

public class Chicken extends Animal implements Eatting {

    @Override
    public String Am_THanh_Animal() {
        return "cuc...tac,cuc...tac";
    }

    @Override
    public String eat() {
        return "chut...chut...chut";
    }
}
