package ua.edu.ucu.flower;

import ua.edu.ucu.order.Item;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter @Table @Entity
public class Flower extends Item {
    @Id 
    private Long id;
    @Getter
    private double sepalLength;
    private FlowerColor color;
    private double price;
    @Getter
    private FlowerType flowerType;
    
    public Flower() {
        sepalLength = 0;
        this.setPrice(0);
    }
    public double getPrice() {
        return price;
    }
    public Flower(Flower flower) {
        sepalLength = flower.sepalLength;
        color = flower.color;
        this.setPrice(flower.getPrice());
        flowerType = flower.flowerType;
    }

    public String getColor() {
        return color.toString();
    }

    public FlowerSpecification getSpecification() {
        return new FlowerSpecification(color, flowerType);
    }

    public String getDescription() {
        return "Flower";
    }
}
