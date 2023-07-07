package designpatterns.decorator;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream =
                new ChocoChips(
                        new StrawberryScoop(
                                new ChocolateCone(
                                        new ChocoChips(
                                                new OrangeCone()
                                        )
                                )
                        )
                );

        //Choco Cone -> -> Choco Chips -> Chocolate Cone -> Strawberry Scoop -> ChocoChips.

        System.out.println(iceCream.getDescription());
        System.out.println(iceCream.getCost());
    }
}
