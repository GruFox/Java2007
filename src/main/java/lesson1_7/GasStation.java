package lesson1_7;

public class GasStation {

    private int available;

    public GasStation(int available) {
        this.available = available;
    }

    public int getAvailable() {
        return available;
    }

    /**
     * Заправить указанное количество литров
     * @param amount
     */
    public void refill(int amount) {
        this.available -= amount;
    }

    @Override
    public String toString() {
        return "GasStation{" +
                "available=" + available +
                '}';
    }
    public void info() {
        System.out.println(this);
    }
}
