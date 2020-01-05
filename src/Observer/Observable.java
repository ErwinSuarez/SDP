package Observer;

public interface Observable {

    void registerObserver(Observing observing);
    void removeObserver(Observing observing);
    void notifyObserver();
    Object getUpdate(Observing observing);

}
