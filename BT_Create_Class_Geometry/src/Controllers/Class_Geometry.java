package Controllers;

import java.util.Scanner;

import Model.Class_Geometry.Circle;
import Model.Class_Geometry.Rectangle;
import Model.Class_Geometry.Square;

public class Class_Geometry {
    public static void Circle() {
        Circle circle = new Circle();
        double area_circle;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choice : ");
        System.out.println("1 : Draws Circle");
        System.out.println("2 : Area Circle");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("          **        ");
            System.out.println("        *****      ");
            System.out.println("     ***********    ");
            System.out.println("  ****************");
            System.out.println("  ****************");
            System.out.println("     **********   ");
            System.out.println("        *****      ");
            System.out.println("          **        ");
        }
        if (choice == 2) {
            System.out.print("Radius : ");
            circle.setRadius(scanner.nextDouble());
            area_circle = circle.getRadius() * 3.14;
            System.out.println("Area Circle = " + area_circle);
        }
    }
    public static void Rectangle() {
        Rectangle rectangle = new Rectangle();
        double area_rectangle;
        double width;
        double height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choice : ");
        System.out.println("1 : Draws Rectangle");
        System.out.println("2 : Area Rectangle");
        int choice = scanner.nextInt();
        if(choice == 1){
            for (int i = 0; i < 3; i++){
                System.out.println("****************");
            }
        }
        if(choice == 2){
            System.out.print("Width : ");
            rectangle.setWidth(scanner.nextDouble());
            System.out.print("Height : ");
            rectangle.setHeigth(scanner.nextDouble());
            area_rectangle = rectangle.getWidth() * rectangle.getHeigth();
            System.out.print("Area Rectangle = " + area_rectangle);
        }
    }
    public static void Square(){
        Square square = new Square();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choice : ");
        System.out.println("1 : Draws Square");
        System.out.println("2 : Area Square");
        double edge;
        double area_square;
        int choice = scanner.nextInt();
        if(choice == 1){
            if(choice == 1){
                for (int i = 0; i < 5; i++){
                    System.out.println("****************");
                }
            }

        }
        if(choice == 2){
            System.out.println("Edge : ");
            square.setEdge(scanner.nextDouble());
            area_square = square.getEdge() * 4;
            System.out.println("Area square = " + area_square);
        }
    }
}
