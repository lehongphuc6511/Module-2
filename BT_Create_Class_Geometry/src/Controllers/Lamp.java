package Controllers;

import Model.Lamp.Switch_Button;

import java.util.Scanner;

public class Lamp {
    public static void lamp(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1 : Open Mode");
        System.out.println("2 : Turn On Lamp");
        System.out.println("3 : Turn Off Lamp");
        System.out.println("0 : exit");
        int choice = sc.nextInt();
        boolean stop = true;
        do{
            Lamp lamp = new Lamp();
            Switch_Button connectToLamp = new Switch_Button();
            switch (choice){
                case 1:
                    System.out.println("1 : Open Mode");
                    System.out.println("2 : Turn On Lamp");
                    System.out.println("3 : Turn Off Lamp");
                    System.out.println("0 : exit");
                case 2:
                    connectToLamp.bat();
                    connectToLamp.tat();
            }
        } while (stop);
    }
}
