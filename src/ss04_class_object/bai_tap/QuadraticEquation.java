package ss04_class_object.bai_tap;

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
    public double getDiscriminant(){
        double delta;
        return  delta = b*b - 4*a*c;
    }
    public double getRoot1(){
        double x;
        return x= (-b+ Math.sqrt(getDiscriminant()))/2/a;
    }
    public double getRoot2(){
        double x;
        return x= (-b- Math.sqrt(getDiscriminant()))/2/a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ax^2 +bx+c =0");
        double a;
        do {
            System.out.println("Enter a");
            a = Double.parseDouble(scanner.nextLine());
            if (a == 0) {
                System.out.println("Enter a again, a !=0");
            }
        }while (a==0);
        System.out.println("Enter b");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter c");
        double c = Double.parseDouble(scanner.nextLine());

        QuadraticEquation qua = new QuadraticEquation(a,b,c);
        if (qua.getDiscriminant()>0) {
            System.out.println("x1=" + qua.getRoot1());
            System.out.println("x2=" + qua.getRoot2());
        }else if (qua.getDiscriminant() ==0){
            System.out.println("x1=x2=" + qua.getRoot1());
        }else  System.out.println("equation no solution");
    }
}
