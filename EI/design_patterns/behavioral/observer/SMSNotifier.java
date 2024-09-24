package design_patterns.behavioral.observer;

public class SMSNotifier implements Observer {
    @Override
    public void update(String post) {
        System.out.println("SMS: New blog post - " + post);
    }
}
