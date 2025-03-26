import java.util.ArrayList;
import java.util.List;

public class SportStore {
    private List<Product> products;
    private List<Customer> customers;
    private List<Order> orders;

    public SportStore() {
        products = new ArrayList<>();
        customers = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Order createOrder(Customer customer, Product[] orderProducts, int[] quantities) {
        Order order = new Order(customer, orderProducts, quantities);
        orders.add(order);
        order.updateStockAfterOrder();
        return order;
    }

    public void displayProductsInCategory(String category) {
        System.out.println("Products in category: " + category);
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                product.displayProduct();
            }
        }
    }

    public void displayCustomerOrders(int customerId) {
        System.out.println("Orders for Customer ID: " + customerId);
        for (Order order : orders) {
            if (order.getCustomer().getId() == customerId) {
                order.displayDetails();
            }
        }
    }
}
