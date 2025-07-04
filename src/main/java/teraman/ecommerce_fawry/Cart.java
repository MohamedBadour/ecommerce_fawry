package teraman.ecommerce_fawry;

import java.util.*;
/**
 *
 * @author moham
 */

public class Cart {
    ArrayList<CartItem> items = new ArrayList<>();

    public void add(Product product, int quantity) {
        if (quantity > product.quantity) {
            System.out.println("Not enough quantity available ");
            return;
        }

        items.add(new CartItem(product, quantity));
    }

    public ArrayList<CartItem> getItems() {
        return items;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}
