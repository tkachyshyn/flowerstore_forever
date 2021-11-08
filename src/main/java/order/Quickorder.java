package order;

import flowerstore.Flower;
import flowerstore.FlowerBucket;
import flowerstore.FlowerPack;
import flowerstore.Flowertype;

public class Quickorder {
    public void quickOrder(){
        FlowerBucket bucket = new FlowerBucket();
        Flower flower_flower = new Flower(Flowertype.CHAMOMILE);
        FlowerPack pack = new FlowerPack();
        flower_flower.setPrice(23);
        pack.flower = flower_flower;
        pack.amount = 13;
        bucket.addFlowers(pack);
        Order order = new Order();
        Receiver receiver = new Receiver();
        order.addUser(receiver);
        order.notifyUser();
        order.deliver(0);
        order.pay(0, bucket.getPrice());
    }
}
