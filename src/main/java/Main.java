package flowerstore;

import decorators.PaperDecorator;
import decorators.RibbonDecorator;
import order.Order;
import order.Quickorder;
import order.Receiver;

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
        Order order = new Order();
        Receiver receiver = new Receiver();
        order.addUser(receiver);
        order.notifyUser();
        order.deliver(1);
        order.pay(1, total);
        Quickorder quickorder = new Quickorder();
        quickorder.quickOrder();
    }
}