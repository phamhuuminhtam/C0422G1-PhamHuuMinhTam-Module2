package ss04_class_object.thuc_hanh;
import java.util.Scanner;
public class Retangle {
    double width, height;

    public Retangle() {
    }

    public Retangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2*(width + height);
    }
    public String display(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        Retangle retangle= new Retangle(width,height);
        System.out.println("Your Rectangle \n"+ retangle.display());
        System.out.println("Perimeter of the Rectangle: "+ retangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ retangle.getArea());
    }

}
