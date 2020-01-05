package Decorator;

public class BasicPC implements PC{

    @Override
    public void buildPC() {
        System.out.println("Bare-essentials of a PC");
        System.out.println("It has a CPU, RAM, Storage Media and a Motherboard");
    }
}
