package myshop;

import myshop.Subsystems.InventorySystem;
import myshop.Subsystems.NotificationSystem;
import myshop.Subsystems.PaymentSystem;
import myshop.Subsystems.ShippingSystem;

public class ECommerceFacade {
    private final InventorySystem inventory;
    private final PaymentSystem payment;
    private final ShippingSystem shipping;
    private final NotificationSystem notification;

    public ECommerceFacade() {
        this.inventory = new InventorySystem();
        this.payment = new PaymentSystem();
        this.shipping = new ShippingSystem();
        this.notification = new NotificationSystem();
    }

    public void placeOrder(Product baseProduct, Product finalProduct, String email) {
        inventory.checkStock(baseProduct);

        payment.processPayment(email, finalProduct.getPrice());

        shipping.shipProduct(baseProduct);

        notification.sendEmail(email,
                "Your order for " + baseProduct.getDescription() + " has been placed!");
        System.out.println("--- Order Completed Successfully ---");
    }
}
