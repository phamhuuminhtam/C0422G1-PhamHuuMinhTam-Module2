package ss12_Java_collection_framework.bai_tap;

import java.util.Comparator;

public class DecresePrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
