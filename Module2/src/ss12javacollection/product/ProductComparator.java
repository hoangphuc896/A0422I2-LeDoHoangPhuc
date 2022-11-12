package ss12javacollection.product;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() - o2.getPrice() > 0) {
            return 1;
        } else if (o1.getPrice() - o2.getPrice() < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
