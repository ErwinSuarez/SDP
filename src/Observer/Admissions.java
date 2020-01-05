package Observer;

public class Admissions implements Observing{

    private String deptName;
    private String msg;
    private Observable observable;

    Admissions(String deptName){
        this.deptName = deptName;
    }

    @Override
    public void update() {
        msg = (String)observable.getUpdate(this);

    }

    @Override
    public void setObservable(Observable observable) {
        this.observable = observable;
    }

}
