package teraman.ecommerce_fawry;

import java.time.*;
import java.util.*;

/**
 *
 * @author moham
 */

public class Ecommerce_fawry {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Enter your balance: ");
        double balance = scanner.nextDouble();
        
        Customer customer = new Customer(name, balance);
        
        Product cheese = new Product("Cheese", 100, 5, true, true, 0.2, "valid");
        Product biscuits = new Product("Biscuits", 150, 3, true, true, 0.7, "valid");
        Product tv = new Product("TV", 2500, 3, false, true, 5.0, "N/A");
        Product scratchCard = new Product("Scratch Card", 50, 10, false, false, 0, "N/A");

        Cart cart = new Cart();
        cart.add(cheese, 2);
        cart.add(tv, 1);
        cart.add(biscuits, 1);
        cart.add(scratchCard, 1);

        CheckoutService.checkout(customer, cart);
        System.out.println("Date " + LocalDateTime.now());
        
        scanner.close();
    }
}
