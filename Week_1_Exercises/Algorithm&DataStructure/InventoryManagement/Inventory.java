import java.util.HashMap;

public class Inventory {
    private HashMap<String, Product> products;

    public Inventory() {
        this.products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
        System.out.println("Product added: " + product);
    }

    public void updateProduct(Product product) {
        if (products.containsKey(product.getProductId())) {
            products.put(product.getProductId(), product);
            System.out.println("Product updated: " + product);
        } else {
            System.out.println("Product not found: " + product.getProductId());
        }
    }

    public void deleteProduct(String productId) {
        if (products.containsKey(productId)) {
            Product removedProduct = products.remove(productId);
            System.out.println("Product deleted: " + removedProduct);
        } else {
            System.out.println("Product not found: " + productId);
        }
    }

    public void printAllProducts() {
        for (Product product : products.values()) {
            System.out.println(product);
        }
    }
}
