public class InventoryTest {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product product1 = new Product("001", "Laptop", 10, 999.99);
        Product product2 = new Product("002", "Smartphone", 25, 599.99);
        Product product3 = new Product("003", "Tablet", 15, 399.99);

        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        inventory.printAllProducts();

        product2.setPrice(549.99);
        inventory.updateProduct(product2);

        inventory.deleteProduct("003");

        inventory.printAllProducts();
    }
}
