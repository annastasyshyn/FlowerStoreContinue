package ua.edu.ucu.flower.decorators;

import ua.edu.ucu.order.Item;

public class PaperDecorator extends AbstractDecorator {
    public PaperDecorator(Item item) {
        this.item = item;
        this.description = item.getDescription() + " with paper";
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return item.getPrice() + 13;
    }
    
}
