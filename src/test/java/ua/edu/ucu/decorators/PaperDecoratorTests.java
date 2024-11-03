package ua.edu.ucu.decorators;

import org.junit.jupiter.api.Test;
import ua.edu.ucu.flower.Flower;
import ua.edu.ucu.flower.decorators.PaperDecorator;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaperDecoratorTests {
    @Test
    public void testGetPrice() {
        double delta = 0.0001;
        double expected = 33;
        Flower flower = new Flower();
        flower.setPrice(20);
        PaperDecorator paper = new PaperDecorator(flower);
        double actual = paper.getPrice();
        assertEquals(actual, expected, delta);
    }

    @Test
    public void testGetDescription() {
        String expected = "Flower with paper";
        Flower flower = new Flower();
        PaperDecorator paper = new PaperDecorator(flower);
        String actual = paper.getDescription();
        assertEquals(actual, expected);
    }
    
}
