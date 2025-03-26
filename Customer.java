public class Customer {
    private int id;
    private String name;
    private String lastName;
    private String email;
    private boolean isLoyalCustomer;

    // Constructor
    public Customer(int id, String name, String lastName, String email, boolean isLoyalCustomer) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.isLoyalCustomer = isLoyalCustomer;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public boolean isLoyalCustomer() { return isLoyalCustomer; }
    public void setLoyalCustomer(boolean loyalCustomer) { isLoyalCustomer = loyalCustomer; }

    public void displayCustomer() {
        System.out.println("Customer ID: " + id + ", Name: " + name + " " + lastName +
                ", Email: " + email + ", Loyal: " + isLoyalCustomer);
    }
}
