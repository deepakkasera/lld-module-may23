package designpatterns.singleton.eagerloading;

public class DataBaseConnection {
    private static DataBaseConnection dataBaseConnection = new DataBaseConnection();
    private DataBaseConnection(){}

    public static DataBaseConnection getInstance() {
//        if (dataBaseConnection == null) {
//            dataBaseConnection = new DataBaseConnection();
//        }
        return dataBaseConnection;
    }
    //Will work in multithreaded environment.

    //Issues :-

    //1. Incase we have more Singleton classes like this, then app startup will increase.
    //2. We can't pass any attribute inside the constructor.
}
