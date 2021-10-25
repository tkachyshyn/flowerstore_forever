package flowerstore;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FlowerPack {
    public int amount;
    public Flower flower;
//    private int amount;

    public double getPrice(){
        return flower.getPrice() * amount;
    }
}