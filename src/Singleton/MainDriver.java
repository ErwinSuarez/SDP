package Singleton;

public class MainDriver {

    public static void main(String[] args) {
        SingletonPattern firstInstance = SingletonPattern. getInstance();
        SingletonPattern secondInstance = SingletonPattern.getInstance();
        SingletonPattern thirdInstance = SingletonPattern.getInstance();

        firstInstance.str = firstInstance.toString();
        System.out.println(firstInstance);

        secondInstance.str = secondInstance.toString();
        System.out.println(secondInstance);
        System.out.println("This should NOT be if there was anther instance");

        thirdInstance.str = thirdInstance.toString();
        System.out.println(thirdInstance);
        System.out.println("Same here, there should be a different reference point");

    }
}
