package ss06_inheritanace.bai_tap.Triangle;

import ss06_inheritanace.thuc_hanh.Shape;

import java.text.DecimalFormat;

public class TestTriangle {
    public static void main(String[] args) {

        Triangle t= new Triangle();
        t.setColor("White");
        t.setSide123(10,20,30);
        t.setFilled(true);
        System.out.println(t);
        Shape t1= new Triangle("Red",true,10.20,30,40);
        System.out.println(t1);
    }
}
