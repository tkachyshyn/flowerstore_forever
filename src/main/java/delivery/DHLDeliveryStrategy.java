package delivery;

public class DHLDeliveryStrategy implements Delivery{

    @Override
    public boolean deliver(String deliveryWay) {
        if (deliveryWay.toLowerCase().equals("dhl") |
                deliveryWay.toLowerCase().equals("dhldelivery")){
            return true;
        }
        return false;
    }
}
