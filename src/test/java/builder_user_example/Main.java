package builder_user_example;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
            .setUsername("Username")
            .setAddress("Address")
            .build();
        System.out.println(user);
    }
}
