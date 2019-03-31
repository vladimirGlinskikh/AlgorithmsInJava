package bankAccount;

public class BankAccount {
    private double balance;

    public BankAccount(double openingBalans) {
        this.balance = openingBalans;
    }

    public BankAccount() {

    }

    public double getDeposit(double amount) {
        return balance + amount;
    }
}
