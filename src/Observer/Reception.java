package Observer;

import java.util.ArrayList;
import java.util.List;

public class Reception implements Observable {

    private List<Observing> observing;
    private String message;

    Reception(){
        this.observing = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observing observing) {
            this.observing.add(observing);
    }

    @Override
    public void removeObserver(Observing observing) {
        this.observing.remove(observing);
    }

    @Override
    public void notifyObserver() {
        List<Observing> observers = new ArrayList<>(this.observing);
        for(Observing observ: observers)
            observ.update();
    }

    @Override
    public Object getUpdate(Observing observing) {
        return message;
    }

    public void postMessage(String msg){
        System.out.println("Posted message: " + msg);
        message = msg;
        notifyObserver();
    }
}
