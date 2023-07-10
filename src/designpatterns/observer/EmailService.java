package designpatterns.observer;

public class EmailService implements OnOrderPlacedSubscriber {

    EmailService() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }
    @Override
    public void announceOrderPlaced() {
        System.out.println("Sending Email");
    }
}
