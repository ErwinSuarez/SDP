package Observer;

public class MainDriver {

    public static void main(String[] args) {
        Reception reception = new Reception();
        Observing admin1 = new Admissions("X-Ray");
        Observing admin2 = new Admissions("Admissions");
        Observing admin3 = new Admissions("Radiologist");
        Observing admin4 = new Admissions("Maintenance");
        Observing admin5 = new Admissions("Nurse");

        reception.registerObserver(admin1);
        reception.registerObserver(admin2);
        reception.registerObserver(admin3);
        reception.registerObserver(admin4);
        reception.registerObserver(admin5);

        admin1.setObservable(reception);
        admin2.setObservable(reception);
        admin3.setObservable(reception);
        admin4.setObservable(reception);
        admin5.setObservable(reception);

        admin1.update();

        reception.postMessage("Patient on the way");

        reception.removeObserver(admin4);

        admin2.update();

        reception.postMessage(null);

    }
}
