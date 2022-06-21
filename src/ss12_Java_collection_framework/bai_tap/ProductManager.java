package ss12_Java_collection_framework.bai_tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ProductManager {
//    public static ArrayList<Product> productsList = new ArrayList<>();
    public static LinkedList<Product> productsList = new LinkedList<>();
    static {
        productsList.add(new Product(1,"bánh 1",30000));
        productsList.add(new Product(2,"bánh 2",25000));
        productsList.add(new Product(3,"bánh 3",35000));
        productsList.add(new Product(5,"bánh 3",55000));
        productsList.add(new Product(4,"bánh 4",50000));
    }
    public static void find(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product name need to found: ");
        String productName = scanner.nextLine();
        int count=0;
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getNameProduct().equals(productName)){
                System.out.println(productsList.get(i));
                count++;
            }
        }if (count ==0) System.out.println("Not Found");
    }
    public static void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter product price: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter product name: ");
        String name = scanner.nextLine();
        productsList.add(new Product(id, name, price));
    }

    public static void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product ID need to edited: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productsList.size(); i++) {
            if (id == productsList.get(i).getId()) {
                System.out.println("Enter product  new price: ");
                int priceNew = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter product new name: ");
                String nameNew = scanner.nextLine();
                productsList.get(i).setNameProduct(nameNew);
                productsList.get(i).setPrice(priceNew);
            }
        }
    }

    public static void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product ID need to deleted: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productsList.size(); i++) {
            if (id == productsList.get(i).getId()) {
                productsList.remove(i);
            }
        }
    }
    public static void display(){
        for (Product p: productsList){
            System.out.println(p);
        }
    }
    public static void sortIncrea(){
        Collections.sort(productsList);
    }

    public static void main(String[] args) {
        add();
        edit();
        delete();
        display();
        System.out.println("increase");
        sortIncrea();
        display();
        System.out.println("decrease");
        DecresePrice decresePrice = new DecresePrice();
        Collections.sort(productsList,decresePrice);
        display();
        find();

    }
}
