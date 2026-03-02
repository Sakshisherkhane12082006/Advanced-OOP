package ExperimentNo5;

public class Customer {
    String customerName;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public void displayCustomer() {
        System.out.println("Customer Name: " + customerName);
    }
}