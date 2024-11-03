package ua.edu.ucu.flower.decorators;
import ua.edu.ucu.order.Item;

public abstract class AbstractDecorator {
    public Item item;
    public String description;
    public String getDescriotion() {
        return description;
    }
}
