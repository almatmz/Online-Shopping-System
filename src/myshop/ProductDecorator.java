package myshop;

public abstract class ProductDecorator implements Product {
    public Product decoratedProduct;
    public ProductDecorator(Product decoratedProduct) {
        this.decoratedProduct = decoratedProduct;
    }
    @Override
    public String getDescription() {
        return decoratedProduct.getDescription();
    }
    @Override
    public double getPrice() {
        return decoratedProduct.getPrice();
    }
}
