package singleton;

public class LazySingleton {
    private static LazySingleton instance;
    private int a;

    private LazySingleton() {
        a = (int) (Math.random() * 100);
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void sayHello() {
        System.out.println(a);
    }
}

class Test {
    public static void main(String args[]) {
        LazySingleton a = LazySingleton.getInstance();
        LazySingleton b = LazySingleton.getInstance();

        a.sayHello();
        b.sayHello();
    }
}