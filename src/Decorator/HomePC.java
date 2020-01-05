package Decorator;

public class HomePC extends PCDecorator {

    public HomePC(PC pc) {
        super(pc);
    }

    @Override
    public void buildPC() {
        super.buildPC();
        System.out.println("Home PC's are small and light for basic use");
    }
}
