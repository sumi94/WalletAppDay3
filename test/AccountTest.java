import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {
    @Test
    public void theWalletAmountShouldBeZeroInitially() throws Exception {
        Account account = new Account();
        assertEquals("0.0", account.toString());
    }

    @Test
    public void shouldAddTenRupeesToTotalOnAddingTenRupees(){
        Account account =new Account();
        account.addMoney(10d);
        assertEquals("10.0", account.toString());
    }

    @Test
    public void shouldNotAddNegativeAmountToWallet() throws Exception {
        Account account = new Account();
        account.addMoney(-10d);
        assertEquals("0.0", account.toString());

    }

    @Test
    public void shouldBeAbleToWithdrawTwentyFromWallet() throws Exception {
        Account account =new Account();
        account.addMoney(20d);
        account.getMoney(20d);
        assertEquals("0.0", account.toString());
    }

    @Test
    public void shouldNotBeAleToWithdrawNegativeMoney() {
        Account account = new Account();
        account.getMoney(-1d);
        assertEquals("0.0", account.toString());
    }

}
