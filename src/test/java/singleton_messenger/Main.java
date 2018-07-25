package singleton_messenger;

public class Main {
    public static void main(String[] args) {
        Messenger m = Messenger.getInstance();
        System.out.println(m);
        m.send("Hello!");
        System.out.println(Messenger.getInstance());
    }
}
