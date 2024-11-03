package ua.edu.ucu.flower.decorators;

import ua.edu.ucu.order.Item;

public class RibbonDecorator extends AbstractDecorator {
    public RibbonDecorator(Item item) {
        this.item = item;
        this.description = item.getDescription() + " with ribbon";
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return item.getPrice() + 40;
    }
    
}
