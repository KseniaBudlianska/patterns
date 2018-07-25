package builder_user_example;

public class User {

    private final String username;
    private final String email;
    private final String address;
    private final String gender;
    private final String phone;

    private User(String username, String email, String address, String gender, String phone) {
        this.username = username;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.phone = phone;
    }

    @Override public String toString() {
        return String.format("Username: %s; Email: %s; Address: %s; Gender: %s; Phone: %s",
            username, email, address, gender, phone);
    }

    public static class UserBuilder {

        private final String username;
        private final String email;
        private String address;
        private String gender;
        private String phone;

        public UserBuilder(String username, String email) {
            this.username = username;
            this.email = email;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public UserBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            return new User(username, email, address, gender, phone);
        }
    }
}
