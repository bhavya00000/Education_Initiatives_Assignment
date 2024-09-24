package design_patterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        BankAccount checkingAccount = AccountFactory.getAccount("checking");
        checkingAccount.accountType();

        BankAccount savingsAccount = AccountFactory.getAccount("savings");
        savingsAccount.accountType();
    }
}
