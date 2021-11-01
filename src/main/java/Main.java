package flowerstore;

import decorators.PaperDecorator;
import decorators.RibbonDecorator;

public class Main {
    public static void main(String[] args) {
        FlowerBucket bucket = new FlowerBucket();
        Flower flower_flower = new Flower(Flowertype.TULIP);
        FlowerPack pack = new FlowerPack();
        flower_flower.setPrice(16);
        pack.flower = flower_flower;
        pack.amount = 1;
        bucket.addFlowers(pack);
        Item item = new RibbonDecorator(bucket);
        item.setPrice(5);
        bucket.addDecorator(item);
        item = new PaperDecorator(item);
        item.setPrice(5);
        bucket.addDecorator(item);
        double total = bucket.getPrice();
        System.out.printf(String.valueOf(total));
    }
}