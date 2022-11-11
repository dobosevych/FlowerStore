package flower.store;

import flower.store.flower.Flower;
import flower.store.flower.FlowerColor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import org.junit.jupiter.api.Assertions;

/**
 * test for flowers
 * @hidden
 */
public class FlowerTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private Flower flower;

    /**
     * setup
     */
    @BeforeEach
    public void init() {
        flower = new Flower();
    }

    /**
     * test price
     */
    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        Assertions.assertEquals(price, flower.getPrice());
    }

    /**
     * test color
     */
    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        Assertions.assertEquals("red", flower.getColor());
    }
}
