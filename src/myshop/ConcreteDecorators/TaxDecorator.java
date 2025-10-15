package myshop.ConcreteDecorators;

import myshop.Product;
import myshop.ProductDecorator;

public class TaxDecorator extends ProductDecorator {
    private  double taxRate;

    public TaxDecorator(Product decoratedProduct, double taxRate) {
        super(decoratedProduct);
        this.taxRate=taxRate;
    }

    @Override
    public String getDescription() {
        return decoratedProduct.getDescription()+ "  + Tax";
    }
    @Override
    public double getPrice() {
        return decoratedProduct.getPrice() * (1 + taxRate);
    }
}
