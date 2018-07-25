package builder_email_example;

public class Main {

    public static void main(String[] args) {
        Email email = new Email.EmailBuilder()
            .addRecipient("john@Doe.com")
            .addRecipient("john1@Doe.com")
            .addRecipient("john2@Doe.com")
            .setMainText("Check the builder pattern")
            .setGreeting("Hi John!")
            //.setClosing("Regards")
            .setTitle("Builder pattern resources")
            .build();
        System.out.println(email);
    }
}
