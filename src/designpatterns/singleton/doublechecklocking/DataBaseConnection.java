package designpatterns.singleton.doublechecklocking;

import javax.xml.crypto.Data;

public class DataBaseConnection {
    private static DataBaseConnection dataBaseConnection = null;
    private DataBaseConnection(){}

    public static DataBaseConnection getInstance() {
        //Double Check locking
        if (dataBaseConnection == null) { //I. Check
            synchronized (DataBaseConnection.class) { // II. Acquire lock // We can use lock also inplace of synchronized block.
                if (dataBaseConnection == null) { // III. Check again
                    dataBaseConnection = new DataBaseConnection();
                }
            }
        }
        return dataBaseConnection;
    }
    //Will work in multithreaded environment.

    //Issues :-
    //Slow performance.
}
