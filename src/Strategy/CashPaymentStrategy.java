package Strategy;

public class CashPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.printf("Payed €%.2f cash", amount);
    }
}
