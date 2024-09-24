package design_patterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Blog blog = new Blog();
        Observer emailNotifier = new EmailNotifier();
        Observer smsNotifier = new SMSNotifier();

        blog.addObserver(emailNotifier);
        blog.addObserver(smsNotifier);

        blog.publishPost("Observer Pattern Explained!");
    }
}
