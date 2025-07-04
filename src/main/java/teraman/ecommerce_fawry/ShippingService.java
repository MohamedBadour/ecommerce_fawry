package teraman.ecommerce_fawry;

import java.util.*;
/**
 *
 * @author moham
 */
public class ShippingService {
    public static void ship(ArrayList<Product> productsToShip) {
        System.out.println("** Shipment notice **");
        double totalWeight = 0;

        for (Product product : productsToShip) {
            System.out.println("1x " + product.name + " " + (int)(product.weight * 1000) + "g");
            totalWeight += product.weight;
        }

        System.out.println("Total package weight " + totalWeight + "kg");
    }
}
