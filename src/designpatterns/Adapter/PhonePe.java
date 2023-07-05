package designpatterns.Adapter;

public class PhonePe {
    public static void main(String[] args) {
        BankAPI bankAPI = new ICICIApiAdapter();

        String rajatAccNo = "1234";
        String sharmiliAccNo = "4321";

        double amount = 100.0;

        bankAPI.sendMoney(rajatAccNo, sharmiliAccNo, amount);
    }
}
