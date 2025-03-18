import java.util.Enumeration;
import java.util.Vector;

class Customer {
    private String _name;
    private Vector<Order> _orders;

    public Customer(String name) {
        this._name = name;
        this._orders = new Vector<>();
    }

    public void addOrder(Order order) {
        _orders.add(order);
    }

    public void printOwing() {
        Enumeration<Order> e = _orders.elements();
        double outstanding = 0.0;

        // Print banner
        System.out.println("********************************");
        System.out.println("***** Customer Owes *****");
        System.out.println("********************************");

        // Calculate outstanding
        while (e.hasMoreElements()) {
            Order each = e.nextElement();
            outstanding += each.getAmount();
        }

        // Print details
        System.out.println("name: " + _name);
        System.out.println("amount: " + outstanding);
    }

    public static void main(String[] args) {
        Customer customer = new Customer("John Doe");
        customer.addOrder(new Order(100.50));
        customer.addOrder(new Order(200.75));

        customer.printOwing();
    }

    private static class Order {
        private double amount;
    
        public Order(double amount) {
            this.amount = amount;
        }
    
        public double getAmount() {
            return amount;
        }
    }
}
