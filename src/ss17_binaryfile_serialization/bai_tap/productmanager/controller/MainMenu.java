package ss17_binaryfile_serialization.bai_tap.productmanager.controller;

import ss17_binaryfile_serialization.bai_tap.productmanager.model.Product;
import ss17_binaryfile_serialization.bai_tap.productmanager.service.Imple.ProductImple;

import java.util.Scanner;

public class MainMenu {
    public static void displayMainMenu() {
        ProductImple productImple = new ProductImple();
        boolean flag = true;
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM" +
                    "\n 1. Thêm " +
                    "\n 2. Hiển thị" +
                    "\n 3. Tìm kiếm" +
                    "\n 4. Thoát");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    productImple.add();
                    break;
                case 2:
                    productImple.display();
                    break;
                case 3:
                    productImple.find();
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}

