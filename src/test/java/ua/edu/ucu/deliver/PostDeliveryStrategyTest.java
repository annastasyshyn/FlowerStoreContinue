package ua.edu.ucu.deliver;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import ua.edu.ucu.delivery.PostDeliveryStrategy;
import ua.edu.ucu.order.Item;
import java.util.ArrayList;
import java.util.List;


public class PostDeliveryStrategyTest {
    @Test
    public void testDeliverWithNoItems() {
        PostDeliveryStrategy deliveryStrategy = new PostDeliveryStrategy();
        List<Item> items = new ArrayList<>();
        String result = deliveryStrategy.deliver(items);
        assertEquals("Delivered 0 items;PostDelivery", result);
    }

    @Test
    public void testDeliverWithSomeItems() {
        PostDeliveryStrategy deliveryStrategy = new PostDeliveryStrategy();
        List<Item> items = new ArrayList<>();
        String result = deliveryStrategy.deliver(items);
        assertEquals("Delivered 0 items;PostDelivery", result);
    }

    @Test
    public void testGetDescription() {
        PostDeliveryStrategy deliveryStrategy = new PostDeliveryStrategy();
        assertEquals("PostDelivery", deliveryStrategy.getDescription());
    }
    
}
