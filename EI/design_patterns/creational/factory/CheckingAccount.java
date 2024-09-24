package design_patterns.creational.factory;

public class CheckingAccount implements BankAccount {
    @Override
    public void accountType() {
        System.out.println("This is a Checking Account.");
    }
}
