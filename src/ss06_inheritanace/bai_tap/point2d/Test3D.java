package ss06_inheritanace.bai_tap.point2d;

public class Test3D {
    public static void main(String[] args) {
        Point2D p2D= new Point2D(1.5f,10.5f);
        Point3D p3D= new Point3D(3.5f,5.5f,6.5f);
        Point2D p2D1= new Point3D(10f,20.5f,11f);
        System.out.println(p2D);
        System.out.println(p3D);
        System.out.println(p2D1);

    }
}
