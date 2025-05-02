package BankingSystem;

public class BankAccount {
    public void deposit() {
        System.out.println("Money deposited.");
    }

    protected void withdraw() {
        System.out.println("Money withdrawn.");
    }

    void checkBalance() {
        System.out.println("Balance checked.");
    }

    private void calculateInterest() {
        System.out.println("Interest calculated.");
    }
}
