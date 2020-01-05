package Strategy;

public class PaymentType {

    public static PaymentStrategy getPayment(String sType){
        switch(sType){
            case "a":
                return new CashPaymentStrategy();
            case "b":
                return new CardPaymentStrategy();
        }
        throw new IllegalArgumentException();
    }
}
