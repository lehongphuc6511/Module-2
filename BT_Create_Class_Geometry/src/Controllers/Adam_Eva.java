package Controllers;

import Model.Adam_Eva.Apple;
import Model.Adam_Eva.Human;

import java.util.Scanner;

public class Adam_Eva {
    public static void human_eat_apple() {
        System.out.println("1 : Display Menu");
        System.out.println("2 : Display imformation Adam");
        System.out.println("3 : Display imformation Eva");
        System.out.println("4 : Adam's talk");
        System.out.println("5 : Eva's talk");
        System.out.println("6 : Adam eat apple");
        System.out.println("7 : Eva eat apple");
        System.out.println("8 : dv Apple");
        System.out.println("0 : exit");
        boolean stop = true;
        do {
            Scanner sc = new Scanner(System.in);
            Human Adam = new Human("Adam", "Male", 50);
            Human Eva = new Human("Eva", "Female", 45);
            Apple apple = new Apple(20);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1 : Display Menu");
                    System.out.println("2 : Display imformation Adam");
                    System.out.println("3 : Display imformation Eva");
                    System.out.println("4 : Adam's talk");
                    System.out.println("5 : Eva's talk");
                    System.out.println("6 : Adam eat apple");
                    System.out.println("7 : Eva eat apple");
                    System.out.println("8 : dv Apple");
                    System.out.println("0 : exit");
                    break;
                case 2:
                    System.out.println("Display imformation Adam : " + Adam.toString());
                    break;
                case 3:
                    System.out.println("Display imformation Eva : " + Eva.toString());
                    break;
                case 4:
                    String adamTalk = sc.nextLine();
                    System.out.println("Adam talk : " + adamTalk);
                    break;
                case 5:
                    String evaTalk = sc.nextLine();
                    System.out.println("Edam talk : " + evaTalk);
                    break;
                case 6:
                    apple.delete();
                    Adam.increase();
                    System.out.println("ate");
                    break;
                case 7:
                    apple.delete();
                    Eva.increase();
                    System.out.println("ate");
                    break;
                case 8:
                    System.out.println("dv Apple : " + apple.getWeight());
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
                    break;
            }
        } while (stop);
    }
}
