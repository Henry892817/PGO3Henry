import java.util.Arrays;

public class Order {
    private static int orderCounter = 1;
    private int orderId;
    private Customer customer;
    private Product[] products;
    private int[] quantities;
    private double totalPrice;
    private String status;

    public Order(Customer customer, Product[] products, int[] quantities) {
        this.orderId = orderCounter++;
        this.customer = customer;
        this.products = products;
        this.quantities = quantities;
        this.status = "Pending";
        calculateTotalPrice();
    }

    private void calculateTotalPrice() {
        totalPrice = 0;
        for (int i = 0; i < products.length; i++) {
            totalPrice += products[i].getPrice() * quantities[i];
        }
        if (customer.isLoyalCustomer()) {
            totalPrice *= 0.9; // 10% discount for loyal customers
        }
    }

    public void applyDiscount() {
        if (customer.isLoyalCustomer()) {
            totalPrice *= 0.9;
        }
    }

    public void updateStockAfterOrder() {
        for (int i = 0; i < products.length; i++) {
            products[i].reduceStock(quantities[i]);
        }
    }

    public void changeOrderStatus(String newStatus) {
        this.status = newStatus;
    }

    public void displayDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName() + " " + customer.getLastName());
        System.out.println("Status: " + status);
        System.out.println("Products:");
        for (int i = 0; i < products.length; i++) {
            System.out.println(" - " + products[i].getName() + " x" + quantities[i]);
        }
        System.out.println("Total Price: " + totalPrice);
    }

    public Customer getCustomer() {
        return null;
    }
}
