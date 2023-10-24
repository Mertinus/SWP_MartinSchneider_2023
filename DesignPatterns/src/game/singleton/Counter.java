package game.singleton;

public class Counter {
    private int counter;
    private static Counter counterInstance = null;

    private Counter() {
        counter = 0;
    }

    public static Counter getInstance() {
        if (counterInstance == null) {
            counterInstance = new Counter();
        }
        return counterInstance;
    }

    public void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
