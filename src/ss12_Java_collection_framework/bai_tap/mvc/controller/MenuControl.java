package ss12_Java_collection_framework.bai_tap.mvc.controller;

import ss12_Java_collection_framework.bai_tap.mvc.service.implement.ProductService;

import java.util.Collections;
import java.util.Scanner;

public class MenuControl {
    public static void displayMenu() {
        boolean flag = true;
        ProductService productService = new ProductService();
        do {
            System.out.println("ProductManager programming" +
                    "\n 1. Add New Product" +
                    "\n 2. Edit product infomation by ID" +
                    "\n 3. Delete product infomation by ID" +
                    "\n 4. Display productlist" +
                    "\n 5. Search product by Name" +
                    "\n 6. Sort productlist by Price" +
                    "\n 7. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    productService.add();

                    productService.display();
                    break;
                case 2:
                    productService.editByID();
                    productService.display();
                    break;
                case 3:
                    productService.deleteByID();
                    productService.display();
                    break;
                case 4:
                    productService.display();
                    break;
                case 5:
                    productService.searchProductByName();
                    break;
                case 6:
                        productService.sortByPrice();
                    break;
                case 7:
                    flag = false;
                    break;

                default:
                    System.out.println("Please choose again!");

            }
        } while (flag);
    }
}
