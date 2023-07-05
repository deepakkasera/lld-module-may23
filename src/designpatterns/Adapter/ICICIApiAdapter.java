package designpatterns.Adapter;

public class ICICIApiAdapter implements BankAPI {
    ICICIBankAPI iciciBankAPI = new ICICIBankAPI();

    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAcc, String toAcc, double amount) {
        System.out.println("ICICI API: Sending " + amount + " rs from " + fromAcc + " to " + toAcc);
        return false;
    }
}
