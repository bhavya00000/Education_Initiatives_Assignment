package design_patterns.creational.factory;

public class AccountFactory {
    public static BankAccount getAccount(String accountType) {
        if ("checking".equalsIgnoreCase(accountType)) {
            return new CheckingAccount();
        } else if ("savings".equalsIgnoreCase(accountType)) {
            return new SavingsAccount();
        }
        return null;
    }
}
