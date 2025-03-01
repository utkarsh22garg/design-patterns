package singleton;

public class ThreadSafeSingleton {
    private int a;

    private ThreadSafeSingleton() {
        a = (int) (Math.random() * 1000);
    }

    private static class BillPughSingletonHolder {
        private static final ThreadSafeSingleton INSTANCE = new ThreadSafeSingleton();
    }

    // in synchronized keyword only one can enter at a time
    public static ThreadSafeSingleton getInstance() {
        return BillPughSingletonHolder.INSTANCE;
    }

    public void printValue() {
        System.out.println(a);
    }

}

class MyThread extends Thread {
    public void run() {
        ThreadSafeSingleton a = ThreadSafeSingleton.getInstance();
        a.printValue();
    }
}

class Test {
    public static void main(String args[]) {

        for (int i = 0; i < 2; i++) {
            MyThread obj = new MyThread();
            obj.start();
        }

    }
}
