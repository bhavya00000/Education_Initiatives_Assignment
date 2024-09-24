package design_patterns.behavioral.observer;

public class EmailNotifier implements Observer {
    @Override
    public void update(String post) {
        System.out.println("Email: New blog post - " + post);
    }
}
