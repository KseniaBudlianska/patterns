package builder_user_example;

public class User {

    private String username;
    private String email;
    private String address;
    private String gender;
    private String phone;

    public User(String username, String email, String address, String gender, String phone) {
        this.username = username;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.phone = phone;
    }

    @Override public String toString() {
        return String.format("Username: %s; Email: %s; Address: %s; Gender: %s; Phone: %s",
            username, email, address, gender, email);
    }

    public static class UserBuilder {

        private String username;
        private String email;
        private String address;
        private String gender;
        private String phone;

        public UserBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
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
