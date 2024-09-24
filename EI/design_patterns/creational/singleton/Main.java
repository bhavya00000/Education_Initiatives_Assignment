package design_patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("First message");
        logger2.log("Second message");

        System.out.println("Are logger1 and logger2 the same? " + (logger1 == logger2));
    }
}
