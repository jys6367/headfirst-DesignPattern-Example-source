package Chapter5_싱글턴.Singleton;

public class Singleton_1 {
    private static Singleton_1 uniqueInstance;

    // 기타 인스턴스 변수

    private Singleton_1() { }

    public static synchronized Singleton_1 getInstance(){
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton_1();
        }
        return uniqueInstance;
    }

    // 기타 메소드
}
