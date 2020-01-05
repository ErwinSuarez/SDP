package Strategy;

import java.util.ArrayList;
import java.util.List;

public class ListedItems {

    private List<Items> itemsList = new ArrayList<>();

    public void addItem(Items items){
        itemsList.add(items);
    }

    public void removeItem(Items items){
        itemsList.remove(items);
    }

    public void pay(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(getCost());
    }

    private double getCost() {
        return itemsList.stream().mapToDouble(Items::getCost).sum();
    }

}
