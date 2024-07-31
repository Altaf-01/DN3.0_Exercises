import java.util.Arrays;

public class SearchAlgorithms {

    // Linear Search Algorithm
    public static Product linearSearch(Product[] products, String productId) {
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }
        return null; // Not found
    }

    // Binary Search Algorithm (requires sorted array)
    public static Product binarySearch(Product[] products, String productId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Product midProduct = products[mid];

            if (midProduct.getProductId().equals(productId)) {
                return midProduct;
            } else if (midProduct.getProductId().compareTo(productId) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // Not found
    }
}
