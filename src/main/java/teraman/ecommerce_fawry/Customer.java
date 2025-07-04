package teraman.ecommerce_fawry;
/**
 *
 * @author moham
 */
public class Customer {
    String name;
    double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deduct(double amount) {
        this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
