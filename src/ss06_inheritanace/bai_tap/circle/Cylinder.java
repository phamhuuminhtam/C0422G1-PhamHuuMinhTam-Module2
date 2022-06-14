package ss06_inheritanace.bai_tap.circle;

import java.text.DecimalFormat;

public class Cylinder  extends Circle{
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double volume(){
        return getArea()*height;
    }

    @Override
    public String toString() {
        DecimalFormat f= new DecimalFormat("#0.00");
        return "Cylinder{" +
                " height=" + height +
                " Volume=" + f.format(volume())+
                " radius=" + +getRadius()+
                " color=" + getColor()+
                '}';
    }
}
