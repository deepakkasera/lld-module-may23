package designpatterns.Adapter;

public class YbAPIAdapter implements BankAPI {
    YesBankAPI yesBankAPI = new YesBankAPI();

    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAcc, String toAcc, double amount) {
        System.out.println("YB API: Sending " + amount + " rs from " + fromAcc + " to " + toAcc);
        return false;
    }
}
