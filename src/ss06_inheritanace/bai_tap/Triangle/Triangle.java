package ss06_inheritanace.bai_tap.Triangle;

import ss06_inheritanace.thuc_hanh.Shape;

import java.text.DecimalFormat;

public class Triangle extends Shape {
    private double side1=1.0;
    private double side2=1.0;
    private double side3=1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public boolean isTriangle(){
        if (side1+side2<=side3 || side1+side3<=side2 || side2+side3<=side1){
            return false;
        }else  return true;
    }
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public void setSide123(double side1, double side2,double side3){
        this.side1= side1;
        this.side2= side2;
        this.side3= side3;

    }
    public double[] getSide123(){
        double[] arr ={side1,side2,side3};
        return arr;
    }
    public  double getPerimeter(){

        return side1+side2+side3;
    }
    public double getArea(){
        return Math.sqrt(getPerimeter()/2*(getPerimeter()/2-side1)*(getPerimeter()/2-side2)*(getPerimeter()/2-side3));
    }

    @Override
    public String toString() {
        DecimalFormat f= new DecimalFormat("#0.00");
        if (isTriangle()){
            return "Triangle{" +
                    " color= "+ getColor()+ ","+
                    " side1=" + side1 +
                    ", side2=" + side2 +
                    ", side3=" + side3 +
                    ", Perimeter is: " +getPerimeter() + ", Square is: " + f.format(getArea()) +"}";
        }else  return "Didn't have any Triangle with "+" side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 ;

    }
}
