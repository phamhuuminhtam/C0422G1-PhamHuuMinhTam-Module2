package ss12_Java_collection_framework.bai_tap.mvc.model;

import java.util.Comparator;

public class Product  {
    private int id;
    private int price;
    private String nameProduct;

    public Product() {
    }

    public Product(int id, String nameProduct, int price) {
        this.id = id;
        this.price = price;
        this.nameProduct = nameProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                ", nameProduct='" + nameProduct + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
