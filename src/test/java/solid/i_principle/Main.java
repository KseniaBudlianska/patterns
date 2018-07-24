package solid.i_principle;

public class Main {
    /**
     * Represents interface segregation principle.
     */
    public static void main(String[] args) {
        Customer customer = new Customer("First", "Last", "Address", "3094");
        new EmailHelper().isEmailReceived(customer, "");
    }
}
