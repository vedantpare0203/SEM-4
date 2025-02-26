package BankingSystem;

public class BankAccount {
    public void deposit(double amount) {
        System.out.println("Deposited: $" + amount);
    }

    protected void withdraw(double amount) {
        System.out.println("Withdrawn: $" + amount);
    }

    void checkBalance() {
        System.out.println("Checking balance...");
    }

    private void calculateInterest() {
        System.out.println("Calculating interest...");
    }
}
