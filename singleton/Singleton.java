package singleton;

public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton() {
        System.err.println("Creating Singleton Instance");
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public static void main(String args[]) {
        // Singleton a = Singleton.getInstance();
        // Singleton b = Singleton.getInstance();

        // create Singleton objects in multiple threads
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                Singleton c = Singleton.getInstance();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                Singleton d = Singleton.getInstance();
            }
        });

        t1.start();
        t2.start();
    }
}