package designpatterns.decorator;

public class OrangeCone implements IceCream {
    //OrangeCone will only behave like a base
    @Override
    public String getDescription() {
        return "Orange Cone";
    }

    @Override
    public int getCost() {
        return 10;
    }
}
