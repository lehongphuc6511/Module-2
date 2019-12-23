package Controllers;

import Model.TH_Class_Animal.Animal.Animal;
import Model.TH_Class_Animal.Animal.Chicken;
import Model.TH_Class_Animal.Animal.Tiger;
import Model.TH_Class_Animal.Foods.Apple;
import Model.TH_Class_Animal.Foods.Food;
import Model.TH_Class_Animal.Foods.Orange;
import Model.TH_Class_Animal.Method.Eatting;

public class TH_Class_Animal {
    public static void Class_Animal(){
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.Am_THanh_Animal());
            ;

            if (animal instanceof Chicken) {
                Eatting eatting = (Chicken) animal;
                System.out.println(eatting.eat());
            }
        }

        Food[] fruits = new Food[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Food food : fruits) {
            System.out.println(food.eat());
        }
    }
}

