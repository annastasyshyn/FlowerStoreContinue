package ua.edu.ucu.decorators;

import org.junit.jupiter.api.Test;
import ua.edu.ucu.flower.Flower;
import ua.edu.ucu.flower.decorators.RibbonDecorator;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class RibbonDecoratorTests {
    @Test
    public void testGetPrice() {
        double delta = 0.0001;
        double expected = 60;
        Flower flower = new Flower();
        flower.setPrice(20);
        RibbonDecorator ribbon = new RibbonDecorator(flower);
        double actual = ribbon.getPrice();
        assertEquals(actual, expected, delta);

    }

    @Test
    public void testGetDescription() {
        String expected = "Flower with ribbon";
        Flower flower = new Flower();
        RibbonDecorator ribbon = new RibbonDecorator(flower);
        String actual = ribbon.getDescription();
        assertEquals(actual, expected);
    }
}
