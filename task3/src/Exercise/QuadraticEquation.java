package Exercise;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;



    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double detail() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.pow(detail(), 0.5)) / 2 * a;
    }

    public double getRoot2() {
        return (-b - Math.pow(detail(), 0.5)) / 2 * a;
    }

    public static void main(String[] args) {
        QuadraticEquation qe = new QuadraticEquation();
        Scanner sc = new Scanner(System.in);

        System.out.print("a : ");
        qe.a = sc.nextDouble();
        System.out.print("b : ");
        qe.b = sc.nextDouble();
        System.out.print("c : ");
        qe.c = sc.nextDouble();

        if (qe.detail() > 0) {
            System.out.println("Nghiem pt 1 = " + qe.getRoot1());
            System.out.println("Nghiem pt 2 = " + qe.getRoot2());
        }
        if (qe.detail() == 0) {
            System.out.println("Nghiem pt  = " + qe.getRoot1());
        }
        if (qe.detail() < 0){
            System.out.println("The equation has no roots");
        }
    }
}

