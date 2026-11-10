import java.util.ArrayList;

/**
 * A class that implements Runnable and checks whether an array can be formed using a given number of elements.
 */
public class ThreadCheckArray implements Runnable {
    private boolean flag;
    private ArrayList<Integer> array;
    private SharedData sd;
    private int b;
    private boolean[] winArray;

    /**
     * Constructs a new instance of ThreadCheckArray with the specified SharedData object.
     *
     * @param sd The SharedData object to use for synchronization and data access.
     */
    public ThreadCheckArray(SharedData sd) {
        this.sd = sd;
        synchronized (sd) {
            array = new ArrayList<>(sd.getArrayList());
            b = sd.getB();
        }
        winArray = new boolean[array.size()];
    }

    /**
     * A recursive method that checks whether the given number of elements can be used to form an array.
     *
     * @param n  The current index in the array being checked.
     * @param b  The remaining number of elements that need to be formed into an array.
     */
    void rec(int n, int b) {
        synchronized (sd) {
            if (sd.getFlag()) return;
        }
        if (n == 1) {
            if (b == 0 || b == array.get(n - 1)) {
                flag = true;
                synchronized (sd) { sd.setFlag(true); }
            }
            if (b == array.get(n - 1)) winArray[n - 1] = true;
            return;
        }

        rec(n - 1, b - array.get(n - 1));
        if (flag) winArray[n - 1] = true;
        synchronized (sd) {
            if (sd.getFlag()) return;
        }
        rec(n - 1, b);
    }

    /**
     * The run method that checks whether the given number of elements can be used to form an array and sets the result.
     */
    public void run() {
        if (array.size() != 1) {
            if (Thread.currentThread().getName().equals("thread1"))
                rec(array.size() - 1, b - array.get(array.size() - 1));
            else
                rec(array.size() - 1, b);
        } else {
            if (b == array.get(0) && !flag) {
                winArray[0] = true;
                flag = true;
                synchronized (sd) { sd.setFlag(true); }
            }
        }

        if (flag) {
            if (Thread.currentThread().getName().equals("thread1"))
                winArray[array.size() - 1] = true;
            synchronized (sd) { sd.setWinArray(winArray); }
        }
    }
}
