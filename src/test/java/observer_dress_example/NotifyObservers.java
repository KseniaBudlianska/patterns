package observer_dress_example;

public class NotifyObservers implements DressAddedListener {

    @Override
    public void notifyListener(Dress dress) {
        System.out.println("Added new dress with brand: " + dress.getBrand());
    }
}
