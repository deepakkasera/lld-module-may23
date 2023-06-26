package designpatterns.singleton.firstapproach;

public class DataBaseConnection {
    private static DataBaseConnection dataBaseConnection = null;
    private DataBaseConnection(){}

    public static DataBaseConnection getInstance() {
        if (dataBaseConnection == null) {
            dataBaseConnection = new DataBaseConnection();
        }
        return dataBaseConnection;
    }

    //This method will work fine for Singleton but won't work in case of Multithreading.
}
