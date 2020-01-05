package Decorator;

public class MainDriver {

    public static void main(String[] args) {

        PC basic = new BasicPC();
        basic.buildPC();
        System.out.println("\n");

        PC home = new HomePC(basic);
        home.buildPC();
        System.out.println("\n");

        /* This also works the same with the one above
        PC home1 = new HomePC(new BasicPC());
        home1.buildPC();
        System.out.println("\n");
        */

        PC office = new OfficePC(home);
        office.buildPC();
        System.out.println("\n");

        PC game = new GamingPC(office);
        game.buildPC();
    }
}
