package Observer;

public class Admissions implements Observing{

    private String docname;
    private String messageRequest;
    private String patient;
    private Observable observable;

    public Admissions(Observable observable){
        this.observable = observable;
        observable.registerObserver(this);
    }
    @Override
    public void update() {
        showList();
    }

    @Override
    public void setObservable(Observable observable) {
        this.observable = observable;
    }

    private void showList() {
        System.out.println("ADMISSION\nPatient: " + patient + " is being requested to have: " + messageRequest + " by Dr. " + docname);
    }
}
