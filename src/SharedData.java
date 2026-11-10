import java.util.ArrayList;

public class SharedData {
    private ArrayList<Integer> array;
    private boolean[] winArray;
    private boolean flag;
    private final int b;

    /**
     * Constructs a new instance of SharedData with an ArrayList and an integer.
     *
     * @param array the ArrayList to store integers
     * @param b the integer value
     */
    public SharedData(ArrayList<Integer> array, int b) {
        this.array = array;
        this.b = b;
        // Initialize winArray using the size of the ArrayList
        this.winArray = new boolean[array.size()];
    }

    /**
     * Returns the ArrayList containing integers.
     *
     * @return the ArrayList of integers
     */
    public ArrayList<Integer> getArray() { return array; }

    /**
     * Sets the ArrayList containing integers.
     *
     * @param array the new ArrayList of integers
     */
    public void setArray(ArrayList<Integer> array) {
        this.array = array;
        // Reinitialize winArray with the new size of the ArrayList
        this.winArray = new boolean[array.size()];
    }

    /**
     * Returns the boolean array indicating win status.
     *
     * @return the boolean array
     */
    public boolean[] getWinArray() { return winArray; }

    /**
     * Sets the boolean array indicating win status.
     *
     * @param winArray the new boolean array
     */
    public void setWinArray(boolean[] winArray) {
        this.winArray = winArray;
    }

    /**
     * Returns the integer value.
     *
     * @return the integer value
     */
    public int getB() { return b; }

    /**
     * Returns the flag indicating some status.
     *
     * @return the flag value
     */
    public boolean getFlag() { return flag; }

    /**
     * Sets the flag indicating some status.
     *
     * @param flag the new flag value
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
