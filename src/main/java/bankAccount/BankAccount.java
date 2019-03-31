package bankAccount;

public class BankAccount {
    private double balance;

    public BankAccount(double openingBalans) {
        this.balance = openingBalans;
    }

    public BankAccount() {

    }

    public double deposit(double amount) {
        return balance + amount;
    }

    public double withDraw(double amount) {
        return balance - amount;
    }
}
