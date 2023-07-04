package designpatterns.factory.components;

public class IosMenu implements Menu {
    @Override
    public void showMenu() {
        System.out.println("IOS Menu");
    }
}
