package Decorator;

public class OfficePC extends PCDecorator {

    public OfficePC(PC pc) {
        super(pc);
    }

    @Override
    public void buildPC() {
        super.buildPC();
        System.out.println("Office PC's come in different sizes for office use");
    }
}
