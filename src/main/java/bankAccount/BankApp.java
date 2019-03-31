package bankAccount;

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.89);
        System.out.println("Start transaction: ");
        account.display();

        account.deposit(23.90);
        System.out.println("After works method deposit()");
        account.display();
        account.withDraw(20.00);
        System.out.println("After works method withDraw()");
        account.display();

        System.out.println("End transaction: ");
        account.display();
    }
}
