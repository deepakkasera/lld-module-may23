package designpatterns.factory;

import designpatterns.factory.components.Button;
import designpatterns.factory.components.Menu;

public interface UIFactory {
    //This interface should only contain the factory method.
    //Factory Method -> That returns an object of corresponding class.

    Button createButton(); // factory method.

    Menu createMenu();
}
