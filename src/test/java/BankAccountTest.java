import bankAccount.BankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankAccountTest {
    BankAccount bankAccount = new BankAccount(34.8);

    @Test
    void
    isThereABalanceOnTheAccount() {
        assertTrue(bankAccount != null);
    }

}
