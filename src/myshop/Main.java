package myshop;

import myshop.ConcreteDecorators.DeliveryDecorator;
import myshop.ConcreteDecorators.DiscountDecorator;
import myshop.ConcreteDecorators.TaxDecorator;

public class Main {
    public static void main(String[] args) {
        Product baseProduct = new BasicProduct("Laptop", 1000);
        Product finalProduct = new DeliveryDecorator(new DiscountDecorator(new TaxDecorator(baseProduct, 0.15), 0.25), 0.05);

        System.out.println("Final Product Description: " + finalProduct.getDescription());
        System.out.println("Final Price: $" + finalProduct.getPrice());

        ECommerceFacade shop = new ECommerceFacade();
        shop.placeOrder(baseProduct, finalProduct, "almmuzdubai@gmail.com");
    }
}
