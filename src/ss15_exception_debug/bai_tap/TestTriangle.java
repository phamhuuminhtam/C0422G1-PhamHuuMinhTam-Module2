package ss15_exception_debug.bai_tap;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        boolean flag= false;
        Scanner scanner =new Scanner(System.in);
        Triangle triangle = new Triangle();
        do{
            try{
            System.out.println("nhập cạnh a");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("nhập cạnh b");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println("nhập cạnh c");
            int c = Integer.parseInt(scanner.nextLine());
                triangle = new Triangle(a,b,c);
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage()) ;

                System.out.println("nhập lại đê bạn ơi");
            }catch (Exception e){
                System.out.println(e.getMessage()) ;

                System.out.println("nhập lại đê bạn ơi");
            }
        }while (true);
        System.out.println(triangle);


    }

}
