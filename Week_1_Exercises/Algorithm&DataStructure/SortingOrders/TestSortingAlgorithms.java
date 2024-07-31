import java.util.Arrays;

public class TestSortingAlgorithms {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("001", "Alice", 250.50),
            new Order("002", "Bob", 150.75),
            new Order("003", "Charlie", 200.00),
            new Order("004", "Diana", 300.25)
        };

        // Test Bubble Sort
        Order[] bubbleSortedOrders = Arrays.copyOf(orders, orders.length);
        SortingAlgorithms.bubbleSort(bubbleSortedOrders);
        System.out.println("Bubble Sort Result:");
        for (Order order : bubbleSortedOrders) {
            System.out.println(order);
        }
        System.out.println("Time complexity for Bubble Sort: O(n^2)");

        // Test Quick Sort
        Order[] quickSortedOrders = Arrays.copyOf(orders, orders.length);
        SortingAlgorithms.quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        System.out.println("\nQuick Sort Result:");
        for (Order order : quickSortedOrders) {
            System.out.println(order);
        }
        System.out.println("Time complexity for Quick Sort: O(n log n) on average");
    }
}
