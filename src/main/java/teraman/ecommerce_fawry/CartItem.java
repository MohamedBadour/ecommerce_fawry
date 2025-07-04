package teraman.ecommerce_fawry;
/**
 *
 * @author moham
 */
public class CartItem {
    Product product;
    int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}
