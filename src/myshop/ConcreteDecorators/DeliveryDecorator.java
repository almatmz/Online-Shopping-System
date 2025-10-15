package myshop.ConcreteDecorators;

import myshop.Product;
import myshop.ProductDecorator;

public class DeliveryDecorator extends ProductDecorator {
    private double deliveryRate;
    public DeliveryDecorator(Product decoratedProduct, double deliveryRate) {
        super(decoratedProduct);
        this.deliveryRate=deliveryRate;
    }

    @Override
    public String getDescription() {
        return decoratedProduct.getDescription()+ " + Delivery Fee";
    }
    @Override
    public double getPrice() {
        return decoratedProduct.getPrice() * (1 + deliveryRate);
    }
}
