package decorators;

import flowerstore.Item;

public class ItemDecorator extends Item {
    private Item item;
    private double price;

    public ItemDecorator(Item item) {
        this.item = item;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getDescription() {
        return "Decorator";
    }
}
