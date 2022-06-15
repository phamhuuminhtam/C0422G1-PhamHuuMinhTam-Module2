package ss07_abstract_interface.bai_tap.resizeable;

public class TestResize {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(10,"blue",true);
        shape[1] = new Square(20.5,"blue",true);
        shape[2]= new Rectangle(19,20.5,"White", true);
        System.out.println("Pre-resize");
        for(Shape s: shape){
            System.out.println(s);
        }
        System.out.println("after resize:");
        for(Shape s: shape){
            s.resize(Math.floor((Math.random()*100)+1));
            System.out.println(s);
        }
    }
}
