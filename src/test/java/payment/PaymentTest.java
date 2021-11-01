package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {
    private CreditCardPaymentStrategy credit;
    private PayPalPaymentStrategy payPal;

    @BeforeEach
    void setUp() {
        credit = new CreditCardPaymentStrategy();
        payPal = new PayPalPaymentStrategy();
    }

    @Test
    void pay(){
        assertEquals(true, credit.pay(23));
        assertEquals(true, payPal.pay(23));
    }
}