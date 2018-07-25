package observer_dress_example;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    List<Dress> dresses = new ArrayList<Dress>();
    List<DressAddedListener> listeners = new ArrayList<>();

    public void addDress(Dress dress) {
        dresses.add(dress);
        notifyListeners(dress);
    }

    private void notifyListeners(Dress dress) {
        listeners.forEach(listener -> listener.notifyListener(dress));
    }

    public void addObserver(NotifyObservers notifyObservers) {
        listeners.add(notifyObservers);
    }

    public void removeObserver(NotifyObservers notifyObservers) {
        listeners.remove(notifyObservers);
    }
}
