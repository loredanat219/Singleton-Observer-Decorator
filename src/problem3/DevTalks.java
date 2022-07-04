package problem3;

import java.util.ArrayList;
import java.util.List;

public class DevTalks implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private String message;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(message));
    }

    void setMessage(String message) {
        this.message = message;
    }
}
