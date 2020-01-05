package Strategy;

public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.printf("Payed €%.2f card", amount);
    }
}
