package Singleton;

public class SingletonPattern {
    private static SingletonPattern ourInstance = new SingletonPattern();

    public static SingletonPattern getInstance() {
        return ourInstance;
    }

    private SingletonPattern() {
    }
}
