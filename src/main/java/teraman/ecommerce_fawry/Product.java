package teraman.ecommerce_fawry;
/**
 *
 * @author moham
 */
public class Product {
    String name;
    double price;
    int quantity;
    boolean isExpiring;
    boolean isShippable;
    double weight;
    String expiryDate;

    public Product(String name, double price, int quantity,
                   boolean isExpiring, boolean isShippable,
                   double weight, String expiryDate) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.isExpiring = isExpiring;
        this.isShippable = isShippable;
        this.weight = weight;
        this.expiryDate = expiryDate;
    }

    public boolean isExpired() {
        return expiryDate.equalsIgnoreCase("expired");
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
}
