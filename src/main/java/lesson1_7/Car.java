package lesson1_7;

public class Car {
    /**
     * Объем бензобака
     */
    private final int volume;

    public Car(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void takeGasoline(GasStation station) {
        station.refill(volume);
    }
}
