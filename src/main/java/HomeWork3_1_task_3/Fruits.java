package HomeWork3_1_task_3;

public class Fruits {
    private String name;
    private float weight;

    public Fruits(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return this.name + " " + weight;
    }
}
