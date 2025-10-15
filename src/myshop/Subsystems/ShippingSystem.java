package myshop.Subsystems;

import myshop.Product;

public class ShippingSystem {
    public void shipProduct(Product product) {
        System.out.println("Shipping: " + product.getDescription());
    }
}
