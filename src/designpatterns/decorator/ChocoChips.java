package designpatterns.decorator;

public class ChocoChips implements IceCream {
    private IceCream iceCream;

    public ChocoChips(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if (iceCream != null) { //Always check for NPE.
            return iceCream.getCost() + 5;
        }
        return 0; // Invalid
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + Choco Chips";
    }
}
