package Decorator;

public class GamingPC extends PCDecorator {

    public GamingPC(PC pc) {
        super(pc);
    }

    @Override
    public void buildPC() {
        super.buildPC();
        System.out.println("Gaming PC's have high end components that deals with extra computational power");
    }
}
