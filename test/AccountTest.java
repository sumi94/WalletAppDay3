import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {
    @Test
    public void theAccountAmountShouldBeZeroInitially() {
        Account account = new Account(0);
        assertEquals("0.0", account.toString());
    }



    @Test
    public void shouldAddTenRupeesToTotalOnAddingTenRupees() {
        Account account =new Account(0);
        account.addMoney(10d);
        assertEquals("10.0", account.toString());
    }

    @Test
    public void shouldNotAddNegativeAmountToAccount() {
        Account account = new Account(0);
        account.addMoney(-10d);
        assertEquals("0.0", account.toString());

    }

    @Test
    public void shouldBeAbleToWithdrawTwentyFromAccount() {
        Account account =new Account(20);
        account.getMoney(20);
        assertEquals("0.0", account.toString());
    }

    @Test
    public void shouldNotBeAleToWithdrawNegativeMoney() {
        Account account = new Account(0);
        account.getMoney(-10d);
        assertEquals("0.0", account.toString());
    }

    @Test
    public void shouldBeAbleToWithdrawTenOnZeroBalance() {
        Account account = new Account(0);
        account.getMoney(10d);
        assertEquals("-10.0", account.toString());
    }
}
