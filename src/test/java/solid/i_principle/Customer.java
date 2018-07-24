package solid.i_principle;

public class Customer implements Emailable {

    private String name;
    private String lastName;
    private String address;
    private String phone;

    public Customer(String name, String lastName, String address, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
}
