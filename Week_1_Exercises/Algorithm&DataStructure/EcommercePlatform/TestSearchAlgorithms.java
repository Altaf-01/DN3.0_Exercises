import java.util.Arrays;

public class TestSearchAlgorithms {
    public static void main(String[] args) {
        Product[] products = {
            new Product("001", "Laptop", "Electronics"),
            new Product("002", "Smartphone", "Electronics"),
            new Product("003", "Tablet", "Electronics")
        };

        // Linear Search Test
        Product resultLinear = SearchAlgorithms.linearSearch(products, "002");
        System.out.println("Linear Search Result: " + resultLinear);
        System.out.println("Time complexity for linear search: O(n)");

        // Sorting array for binary search
        Arrays.sort(products, (p1, p2) -> p1.getProductId().compareTo(p2.getProductId()));

        // Binary Search Test
        Product resultBinary = SearchAlgorithms.binarySearch(products, "002");
        System.out.println("Binary Search Result: " + resultBinary);
        System.out.println("Time complexity for binary search: O(log n)");
    }
}
