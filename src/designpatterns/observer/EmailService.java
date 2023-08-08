package designpatterns.observer;

public class EmailService implements OnOrderPlacedSubscriber {
    //Subscriber
    EmailService() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }
    @Override
    public void announceOrderPlaced() {
        System.out.println("Sending Email");
    }
}
