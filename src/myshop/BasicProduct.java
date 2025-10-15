package myshop;

public class BasicProduct implements Product {
    private final String name;
    private final double basePrice;

    public BasicProduct(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    @Override
    public String getDescription() {
        return name;
    }

    @Override
    public double getPrice() {
        return basePrice;
    }
}
