package Chapter5_싱글턴.Singleton;

public class Singleton_2 {
    private static Singleton_2 uniqueInstance = new Singleton_2();

    private Singleton_2() { }

    public static Singleton_2 getInstance(){
        return uniqueInstance;
    }
}
