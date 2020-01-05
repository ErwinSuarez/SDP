package Singleton;

class SingletonPattern {

    String str;
    private static SingletonPattern ourInstance = null;

    static SingletonPattern getInstance() {
        if (ourInstance == null)
            ourInstance = new SingletonPattern();
        return ourInstance;
    }

    private SingletonPattern() {
        str = "Creating first instance";
    }
}
