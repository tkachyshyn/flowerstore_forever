package flowerstore;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FlowerPack{
    public int amount;
    public static Flower flower;

    public double getPrice() {
        return flower.getPrice() * amount;
    }
}