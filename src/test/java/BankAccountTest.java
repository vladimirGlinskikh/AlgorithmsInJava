import bankAccount.BankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankAccountTest {
    @Test
    void
    isThereABalanceOnTheAccount() {
        BankAccount bankAccount = new BankAccount(34.8);
        assertTrue(bankAccount != null);
    }

    @Test
    void depositTheFundsIntoTheAccount() {
        BankAccount bankAccount = new BankAccount(32.11);
        assertEquals(65.33, bankAccount.getDeposit(33.22), 0.00);
    }
}
