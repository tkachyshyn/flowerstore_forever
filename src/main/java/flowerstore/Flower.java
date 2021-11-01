package flowerstore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Getter  @Setter @ToString

public class Flower extends Item{
    public int price;
//    private double price;
    private double sepalength;
    private int[] color;
    private Flowertype flowertype;

    public Flower() {

    }

    public void setColor(int[] color){

        this.color = Arrays.copyOf(color, color.length);
    }

    public Flower(Flowertype flowertype){

        this.flowertype = flowertype;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    @Override
    public String getDescription(){
        return "Flower of type " + flowertype;
    }
}


