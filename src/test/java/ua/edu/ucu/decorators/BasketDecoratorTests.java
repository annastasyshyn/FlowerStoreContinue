package ua.edu.ucu.decorators;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import ua.edu.ucu.flower.Flower;
import ua.edu.ucu.flower.decorators.BasketDecorator;

public class BasketDecoratorTests {
    @Test
    public void testGetPrice() {
        double delta = 0.0001;
        double expected = 24;
        Flower flower = new Flower();
        flower.setPrice(20);
        BasketDecorator basket = new BasketDecorator(flower);
        double actual = basket.getPrice();
        assertEquals(actual, expected, delta);
    }

    @Test
    public void testGetDescription() {
        String expected = "Flower with basket";
        Flower flower = new Flower();
        BasketDecorator basket = new BasketDecorator(flower);
        String actual = basket.getDescription();
        assertEquals(actual, expected);
    }
}
