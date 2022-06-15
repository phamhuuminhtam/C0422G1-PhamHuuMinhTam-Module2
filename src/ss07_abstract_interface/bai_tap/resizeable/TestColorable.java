package ss07_abstract_interface.bai_tap.resizeable;

import java.text.DecimalFormat;

public class TestColorable {
    public static void main(String[] args) {
        DecimalFormat f= new DecimalFormat("0.00");
        Shape[] shape = new Shape[4];
        shape[0] = new Circle(10,"blue",true);
        shape[1] = new Square(20.5,"blue",true);
        shape[2]= new Rectangle(19,20.5,"White", true);
        shape[3]= new Square(40.5,"Yellow", false);
        for (Shape s: shape){
            System.out.println(s + " AND has Square: "+ f.format(s.getArea()));
            if (s instanceof Square){
                ((Square) s).howToColor();
            }
        }
    }

}
