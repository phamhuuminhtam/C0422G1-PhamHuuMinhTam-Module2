package ss06_inheritanace.bai_tap.pointmove;

public class TestMovablePoint {
    public static void main(String[] args) {
        Point p= new Point();
        MovablePoint m= new MovablePoint();
        Point m2= new MovablePoint();
        p.setX(20f);
        p.setXY(30f,40f);
        m.setXY(50f,35f);
        m.setSpeed(30f,30f);
        System.out.println(p);
        System.out.println(m);
        System.out.println(m2);
        System.out.println(m.move());
        ((MovablePoint)m2).setSpeed(30f,30f);
        System.out.println(((MovablePoint) m2).move());
    }
}
