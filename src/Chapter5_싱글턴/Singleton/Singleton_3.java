package Chapter5_싱글턴.Singleton;

public class Singleton_3 {
    private volatile static Singleton_3 uniqueInstance;

    private Singleton_3(){}

    public static Singleton_3 getInstance(){
        if (uniqueInstance == null) {
            synchronized (Singleton_3.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton_3();
                }
            }
        }
        return uniqueInstance;
    }
}
