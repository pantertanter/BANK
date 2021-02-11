import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private List<Transaction> transactions;
    private Customer customer;

    @BeforeEach
    void setUp() {
        this.transactions = new ArrayList<>();
        this.customer = new Customer("Bot");
    }

    @Test
    void getBalance() {
    }

    @Test
    void withDrawAmount() {
    }

    @Test
    void depositAmount() {
    }
}