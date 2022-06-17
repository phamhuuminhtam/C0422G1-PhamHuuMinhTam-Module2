package ss10_dsa_danhsach.bai_tap;

import java.util.ArrayList;

public class MyListTest {

    public static void main(String[] args) {
        MyArrayList<String> list1 = new MyArrayList<>();
        list1.add(0, "SuperMan");
        list1.add(1, "SuperMan2");
        list1.add(2, "SuperMan3");
        list1.add(3, "SuperMan4");
        list1.add(4, "SuperMan5");
        list1.add(5, "SuperMan6");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        System.out.println(list1);



    }
}


