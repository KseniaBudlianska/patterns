package builder_user_example;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Username", "Email")
            .setAddress("Address")
            .build();
        System.out.println(user);
        /**
         * 1. The User constructor is private, which means that this class
         * can not be directly instantiated from the client code.
         * NOT POSSIBLE: User user1 = new User("Username", "Email")
         * 2. The class is once again immutable. All attributes are final
         * and they’re set on the constructor. Additionally, we only provide getters for them.
         * 3. The builder constructor only receives the required attributes and this attributes
         * are the only ones that are defined “final” on the builder to ensure that their values
         * are set on the constructor.
         */

    }
}
