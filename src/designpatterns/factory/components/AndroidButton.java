package designpatterns.factory.components;

public class AndroidButton implements Button {
    @Override
    public void showButton() {
        System.out.println("Android Button");
    }
}
