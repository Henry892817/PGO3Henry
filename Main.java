public class Main {
    public static void main(String[] args) {
        SportStore store = new SportStore();

        // Creating Products
        Product product1 = new Product(1, "Football", "Ball", 400.20, 5);
        Product product2 = new Product(2, "Jordan Shoes", "Shoe", 500.50, 10);

        store.addProduct(product1);
        store.addProduct(product2);

        // Creating Customers
        Customer customer1 = new Customer(1, "Bego", "LEE", "s28213@pjwstk.edu.com", false);
        Customer customer2 = new Customer(2, "Henry", "Lewis", "henry@pjwstk.edu.com", true);

        store.addCustomer(customer1);
        store.addCustomer(customer2);

        // Creating Orders
        Product[] orderProducts1 = {product1, product2};
        int[] orderQuantities1 = {1, 1};

        Order order1 = store.createOrder(customer1, orderProducts1, orderQuantities1);
        order1.applyDiscount();

        // Display Order Details
        System.out.println("Order details:");
        order1.displayDetails();

        // Display Stock Levels After Order
        System.out.println("\nStock levels after the order:");
        store.displayProductsInCategory("Ball");
        store.displayProductsInCategory("Shoe");

        // Changing Order Status
        order1.changeOrderStatus("Completed");
        System.out.println("\nOrder status after update:");
        order1.displayDetails();
    }
}
