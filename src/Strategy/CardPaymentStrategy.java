package Strategy;

public class CardPaymentStrategy implements PaymentStrategy {

    private String nameOnCard = "John Doe";
    private String carNumber = "4566987112368522";
    private int cvv = 214;
    private String expirationDate = "21/04/2022";

    @Override
    public void pay(double amount) {
        System.out.printf("Payed €%.2f card", amount);
        System.out.printf("Using card  %s", nameOnCard);
    }
}
