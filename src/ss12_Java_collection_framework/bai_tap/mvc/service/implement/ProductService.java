package ss12_Java_collection_framework.bai_tap.mvc.service.implement;


import ss12_Java_collection_framework.bai_tap.mvc.model.Product;
import ss12_Java_collection_framework.bai_tap.mvc.service.IProductService;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductService implements IProductService {
    public static ArrayList<Product> productsList = new ArrayList<>();

    static {
        productsList.add(new Product(1, "bánh 1", 30000));
        productsList.add(new Product(2, "bánh 2", 25000));
        productsList.add(new Product(3, "bánh 3", 35000));
        productsList.add(new Product(5, "bánh 3", 55000));
        productsList.add(new Product(4, "bánh 4", 50000));
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        int id;
        do {
            System.out.println("Enter product ID: ");
            id = Integer.parseInt(scanner.nextLine());
            if (checkId(id)) {
                System.out.println("Id is exist! Enter another ID please!");
            }
        } while (checkId(id));

        System.out.println("Enter product price: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter product name: ");
        String name = scanner.nextLine();
        productsList.add(new Product(id, name, price));
        System.out.println("Successfully added!");
    }

    @Override
    public void editByID() {
        int id;
        do {
            System.out.println("Enter product ID: ");
            id = Integer.parseInt(scanner.nextLine());
            if (!checkId(id)) {
                System.out.println("Id is not Found, Enter another ID please! ");
            }
        } while (!checkId(id));
        for (Product p : productsList) {
            if (id == p.getId()) {
                System.out.println("Enter product  new price: ");
                int priceNew = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter product new name: ");
                String nameNew = scanner.nextLine();
                p.setNameProduct(nameNew);
                p.setPrice(priceNew);
            }

        }
        System.out.println("Successfully edited!");
    }

    @Override
    public void deleteByID() {
        int id;
        do {
            System.out.println("Enter product ID: ");
            id = Integer.parseInt(scanner.nextLine());
            if (!checkId(id)) {
                System.out.println("Id is not Found, Enter another ID please! ");
            }
        } while (!checkId(id));
        for (Product p : productsList) {
            if (id == p.getId()) {
                productsList.remove(p);
            }
        }
        System.out.println("Successfully deleted!");
    }

    @Override
    public void display() {
        for (Product p : productsList) {
            System.out.println(p);
        }
    }

    @Override
    public void searchProductByName() {
        System.out.println("Enter product name need to found: ");
        String productName = scanner.nextLine();
        int count = 0;
        for (Product p : productsList) {
            if (p.getNameProduct().equals(productName)) {
                System.out.println(p);
                count++;
            }
        }
        if (count == 0) System.out.println("Not Found");
    }

    @Override
    public void sortByPrice() {
                System.out.println("Choose Sort Ascending or Descending:" +
                "\n 1. Ascending" +
                "\n 2. Descending");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                Collections.sort(productsList, new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        return o1.getPrice()- o2.getPrice();
                    }
                });
                display();
                break;
            case 2:
                Collections.sort(productsList, new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        return o2.getPrice()-o1.getPrice();
                    }
                });
                display();
                break;
            default: System.exit(1);
        }
    }

    @Override
    public boolean checkId(int id) {
        for (Product p : productsList) {
            if (p.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
