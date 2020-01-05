package Decorator;

public class PCDecorator implements PC {

    private PC pc;

    public PCDecorator(PC pc){
        this.pc = pc;
    }

    @Override
    public void buildPC() {
        this.pc.buildPC();
    }
}
