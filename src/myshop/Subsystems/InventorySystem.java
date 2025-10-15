package myshop.Subsystems;

import myshop.Product;

public class InventorySystem {
    public boolean checkStock(Product product) {
        System.out.println("Checking stock for: " + product.getDescription());
        return true;
    }
}
