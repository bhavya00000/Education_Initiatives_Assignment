package design_patterns.behavioral.observer;
import java.util.ArrayList;
import java.util.List;

public class Blog {
    private List<Observer> observers = new ArrayList<>();
    private String post;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void publishPost(String post) {
        this.post = post;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(post);
        }
    }
}
