import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account account;
    private Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer("Bot");
        account = new Account(customer);
        account.depositAmount(500);
        account.depositAmount(200);
        account.depositAmount(400);
    }

    @Test
    void getBalance() {
        int sum = 0;
        for (Transaction transaction : account.getTransactions()) {
            sum += transaction.getAmount();
        }
        assertEquals(sum, account.getBalance());
    }

    @Test
    void withDrawAmount() {
        int sum = 0;
        for (Transaction transaction : account.getTransactions()) {
            sum += transaction.getAmount();
        }
        assertEquals(sum, account.getBalance());
    }

    @Test
    void depositAmount() {
        int sum = 0;
        for (Transaction transaction : account.getTransactions()) {
            if(transaction.getAmount() > 0){
               sum += transaction.getAmount();
               assertEquals(sum, );
            }
        }
        account.getBalance():

    }

}