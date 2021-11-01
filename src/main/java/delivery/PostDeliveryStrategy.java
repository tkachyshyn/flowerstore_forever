package delivery;

public class PostDeliveryStrategy implements Delivery{
    @Override
    public boolean deliver(String deliveryWay) {
        if (deliveryWay.toLowerCase().equals("post") |
                deliveryWay.toLowerCase().equals("post delivery") |
                deliveryWay.toLowerCase().equals("postdelivery")){
            return true;
        }
        return false;
    }
}
