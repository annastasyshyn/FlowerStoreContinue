package ua.edu.ucu.flower.decorators;

import ua.edu.ucu.order.Item;

public class BasketDecorator extends AbstractDecorator {
    public BasketDecorator(Item item) {
        this.item = item;
        this.description = item.getDescription() + " with basket";
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return item.getPrice() + 4;
    }
    
}
