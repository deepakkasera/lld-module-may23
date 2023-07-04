package designpatterns.factory.components;

public class IosButton implements Button {
    @Override
    public void showButton() {
        System.out.println("Ios Button");
    }
}
