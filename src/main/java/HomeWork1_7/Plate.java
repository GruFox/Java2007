package HomeWork1_7;

public class Plate {

    private int fullnessPlate;

    public Plate(int fullnessPlate) {
        this.fullnessPlate = fullnessPlate;
    }

    public int getFullnessPlate() {
        return fullnessPlate;
    }

    public int refill(int amount) {
        return this.fullnessPlate -= amount;

    }

    @Override
    public String toString() {
        return "Plate{" +
                "fullness=" + fullnessPlate +
                '}';
    }

    public void info() {
        System.out.println(this);
    }

    public void isFull(Cat cat) {
        if (this.fullnessPlate < cat.getCatEat()) {
            this.fullnessPlate += 30;
        }
    }
}
