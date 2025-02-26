package UserAccount;

import BankingSystem.BankAccount;

public class Customer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);  // Accessible (public)

        // account.withdraw(500); // Not accessible (protected - only accessible via subclass or same package)
        // account.checkBalance(); // Not accessible (default - only accessible within the same package)
        // account.calculateInterest(); // Not accessible (private - only accessible within the class)
    }
}
