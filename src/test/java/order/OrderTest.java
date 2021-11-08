package order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderTest {
    Receiver user1;
    Receiver user2;
    Order order;

    @BeforeEach
    void setUp() {
        user1 = new Receiver();
        user2 = new Receiver();
        order = new Order();
    }

    @Test
    void addUser() {
        order.addUser(user1);
        order.addUser(user2);
        assertEquals(2, order.getUser().size());
    }

    @Test
    void removeUser() {
        order.removeUser(user1);
        assertEquals(1, order.getUser().size());
    }

    @Test
    void notifyUser() {
        order.notifyUser();
        assertEquals("notified", user1.getStatus());
    }
}