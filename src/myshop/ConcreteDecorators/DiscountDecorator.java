package myshop.ConcreteDecorators;

import myshop.Product;
import myshop.ProductDecorator;

public class DiscountDecorator extends ProductDecorator {
    private double discountRate;
    public DiscountDecorator(Product decoratedProduct, double discountRate) {
        super(decoratedProduct);
        this.discountRate = discountRate;
    }

    @Override
    public String getDescription() {
        return decoratedProduct.getDescription()+ " + Discount";
    }
    @Override
    public double getPrice() {
        return decoratedProduct.getPrice() * (1 - discountRate);
    }
}
