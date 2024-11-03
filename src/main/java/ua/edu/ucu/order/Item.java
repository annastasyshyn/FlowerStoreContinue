package ua.edu.ucu.order;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Item {
    double price;
    private String description;
    public abstract double getPrice();
    public String getDescription() {
        return description;
    }
}
