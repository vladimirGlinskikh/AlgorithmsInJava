package bankAccount;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public BankAccount() {

    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double withDraw(double amount) {
        balance -= amount;
        return balance;
    }

    public void display() {
        System.out.println("balance=" + String.format("%.2f", balance));
    }
}
