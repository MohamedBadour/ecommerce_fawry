package teraman.ecommerce_fawry;

import java.util.*;
/**
 *
 * @author moham
 */
public class CheckoutService {
    public static void checkout(Customer customer, Cart cart) {
        if (cart.isEmpty()) {
            System.out.println("Card is empty");
            return;
        }

        double subtotal = 0;
        double shipping = 0;
        ArrayList<Product> productsToShip = new ArrayList<>();

        for (CartItem item : cart.getItems()) {
            Product p = item.product;

            if (p.isExpired()) {
                System.out.println("Product " + p.name + " is expired");
                return;
            }

            if (item.quantity > p.quantity) {
                System.out.println("Product " + p.name + " isn't available in the requested quantity");
                return;
            }

            subtotal += p.price * item.quantity;

            if (p.isShippable) {
                for (int i = 0; i < item.quantity; i++) {
                    productsToShip.add(p);
                    shipping += p.weight * 30;
                }
            }
        }

        double total = subtotal + shipping;

        if (customer.getBalance() < total) {
            System.out.println("Insufficient balance");
            return;
        }

        for (CartItem item : cart.getItems()) {
            item.product.quantity -= item.quantity;
        }

        customer.deduct(total);

        if (!productsToShip.isEmpty()) {
            ShippingService.ship(productsToShip);
        }

        System.out.println("** Checkout receipt **");
        for (CartItem item : cart.getItems()) {
            System.out.println(item.quantity + "x " + item.product.name + " " + (item.product.price * item.quantity));
        }
        System.out.println("----------------------");
        System.out.println("Subtotal " + subtotal);
        System.out.println("Shipping " + shipping);
        System.out.println("Amount " + total);
        System.out.println("Remaining Balance " + customer.getBalance());
    }
}
