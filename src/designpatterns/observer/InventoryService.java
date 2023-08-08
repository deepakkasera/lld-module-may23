package designpatterns.observer;

public class InventoryService implements OnOrderPlacedSubscriber {
    //Subscriber
    InventoryService() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    @Override
    public void announceOrderPlaced() {
        System.out.println("Notifying Inventory");
    }
}