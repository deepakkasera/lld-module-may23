package designpatterns.factory;

public class Flutter {
    void refreshUI() {
        System.out.println("Refreshing UI");
    }

    void setTheme() {
        System.out.println("Setting theme");
    }

    UIFactory createFactory(SupportedPlatforms platform) {
        //Too many if-else conditions -> OCP violation.
//        if (platform.equals(SupportedPlatforms.ANDROID)) {
//            return new AndroidUIFactory();
//        } else {
//            return new IosUIFactory();
//        }

        //Practical Factory
        return UIFactoryFactory.getUIFactory(platform);
    }
}
