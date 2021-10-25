package flowerstore;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower = new Flower(Flowertype.CHAMOMILE);
        flower.setPrice(10);
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(10, flower.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getFlowertype () {
        assertEquals(Flowertype.CHAMOMILE, flower.getFlowertype());
    }
}