package flowerstore;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item {
    List<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();
    List<Item> bucketDecorators = new ArrayList<Item>();

    public void addFlowers(FlowerPack flowerPack) {
        this.flowerPacks.add(flowerPack);
    }

    public void addDecorator(Item decorator) {
        this.bucketDecorators.add(decorator);
    }

    @Override
    public double getPrice(){
        double price = 0;
        for(int i = 0; i < flowerPacks.size(); i++){
            price += flowerPacks.get(i).getPrice();
        }
        System.out.println(bucketDecorators.size());
        for(int i = 0; i < bucketDecorators.size(); i++){
            System.out.println(bucketDecorators.get(i).getPrice());
            price += bucketDecorators.get(i).getPrice();
        }
        return price;
    }

    public boolean searchFlower(String flower){
        if(flower.toLowerCase().equals("tulip") | flower.toLowerCase().equals("rose")
                | flower.toLowerCase().equals("chamomile")){
            return true;
        }
        return false;
    }

    @Override
    public String getDescription() {
        return null;
    }



}
