package Observer;

public class Admissions implements Observing{

    private String deptName;
    private Observable observable;

    Admissions(String deptName){
        this.deptName = deptName;
    }

    @Override
    public void update() {
        String msg = (String)observable.getUpdate(this);
        if(msg == null)
            System.out.printf("%s: NO new message\n", deptName);
        else
            System.out.printf("%s: message received: %s\n",deptName,msg );
    }

    @Override
    public void setObservable(Observable observable) {
        this.observable = observable;
    }

}
