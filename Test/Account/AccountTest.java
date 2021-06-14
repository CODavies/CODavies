package Account;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
Account account;
    @BeforeEach
    void setUp() {
       account = new Account();
    }
    @AfterEach
    void tearDown(){
        account = null;
    }
    @Test
    void newAccountClassHasBeenCreated(){
        assertNotNull(account);
    }
    @Test
    void accountCanDepositMoney(){
        account.depositMoney(4000);
        assertEquals(4000,account.getBalance());

    }
    @Test
    void accountCannotDepositNegativeValue(){
        assertEquals(0, account.depositMoney(-300));
    }
    @Test
    void accountCanDepositMoreThanOnce(){
        assertEquals(300, account.depositMoney(300));
        assertEquals(500,account.depositMoney(200));
    }
    @Test
    void accountCanWithdrawMoney(){
        assertEquals(4000, account.depositMoney(4000));
        assertEquals(2000, account.withdrawMoney(2000));

    }
    @Test
    void accountCannotWithdrawAmountGreaterThanMoneyInDeposited(){
        assertEquals(4000, account.depositMoney(4000));
        assertEquals(0,account.withdrawMoney(6000));
    }
    @Test
    void accountCannotWithdrawNegativeAmount(){
        assertEquals(4000, account.depositMoney(4000));
        assertEquals(0,account.withdrawMoney(-6000));

    }
    @Test
    void accountCanPayForUtilityBills(){
        assertEquals(4000, account.depositMoney(4000));
        assertEquals(3700, account.payForUtilityBills(300));
    }
    @Test
    void accountCannotPayUtilityBillsWithNegativeAmount(){
        assertEquals(4000, account.depositMoney(4000));
        assertEquals(4000,account.payForUtilityBills(-6000));
    }
    @Test
    void accountCanTransferMoneyToAnotherAccount(){
        assertEquals(4000, account.depositMoney(4000));
        assertEquals(1435, account.transferAmount(2500));
    }
@Test
    void accountCannotTransferNegativeMoney(){
    assertEquals(4000, account.depositMoney(4000));
    assertEquals(4000,account.transferAmount(-6000));
}
@Test
    void aCertainChargeIsDebitedWhenTransferIsMade(){
    assertEquals(4000, account.depositMoney(4000));
    assertEquals(1935,account.transferAmount(2000));
}
@Test
    void accountCanShowYourRemainingAmountInBank(){
    assertEquals(8000, account.depositMoney(8000));
    assertEquals(7700, account.payForUtilityBills(300));
    assertEquals(5935,account.transferAmount(2000));
    assertEquals(6000, account.withdrawMoney(2000));
    assertEquals(8000, account.getBalance());
}
@Test
    void accountCanSetNameOfClient(){
        account.setFirstName("Davies");
        account.setLastName("Chijioke");
        assertEquals("Davies Chijioke", account.clientsFirstAndLastName());
}
}

