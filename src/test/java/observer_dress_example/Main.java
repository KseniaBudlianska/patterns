package observer_dress_example;

public class Main {
    public static void main(String[] args) {
        Dress dress = new Dress("chanel");
        Shop zalando = new Shop();
        NotifyObservers user1 = new NotifyObservers();
        NotifyObservers user2 = new NotifyObservers();
        NotifyObservers user3 = new NotifyObservers();
        zalando.addObserver(user1);
        zalando.addObserver(user2);
        zalando.addObserver(user3);
        zalando.addDress(dress);
        zalando.removeObserver(user3);
        Dress dress1 = new Dress("chanel_demo");
        zalando.addDress(dress1);
    }
}
