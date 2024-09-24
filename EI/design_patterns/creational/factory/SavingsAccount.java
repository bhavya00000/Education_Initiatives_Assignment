package design_patterns.creational.factory;

public class SavingsAccount implements BankAccount {
    @Override
    public void accountType() {
        System.out.println("This is a Savings Account.");
    }
}
