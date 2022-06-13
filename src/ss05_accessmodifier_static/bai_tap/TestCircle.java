package ss05_accessmodifier_static.bai_tap;

import java.text.DecimalFormat;

public class TestCircle {
    public static void main(String[] args) {
        DecimalFormat f = new DecimalFormat("#0.00");
        Circle c1= new Circle(2.0);
        System.out.println(c1.getRadius());
        System.out.println(f.format(c1.getArea()));
    }

}
