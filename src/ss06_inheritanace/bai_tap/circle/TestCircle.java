package ss06_inheritanace.bai_tap.circle;

import java.text.DecimalFormat;

public class TestCircle {
    public static void main(String[] args) {
        DecimalFormat f= new DecimalFormat("#0.00");
        Circle c1= new Circle(2.0,"blue");
        Circle c2= new Cylinder(2.0,"blue",4.5);
        Cylinder t = new Cylinder(4,"green",10);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(t);
        System.out.println(f.format(((Cylinder)c2).volume()));
    }
}
