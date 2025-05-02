package UserAccount;

import BankingSystem.BankAccount;

public class Customer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit();          // Accessible
        // account.withdraw();     // Not accessible (protected)
        // account.checkBalance(); // Not accessible (default)
        // account.calculateInterest(); // Not accessible (private)
    }
}
