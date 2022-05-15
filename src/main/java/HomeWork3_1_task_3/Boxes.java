package HomeWork3_1_task_3;

import java.util.ArrayList;

public class Boxes <T extends Fruits> {
    private final ArrayList<T> fruits;

    public Boxes() {
        this.fruits = new ArrayList<>();
    }
    public void addInBox(T fruit){
        fruits.add(fruit);
    }
    public ArrayList<T> getFruits() {
        return fruits;
    }
    public float getWeight() {
        float totalWeight = 0.0f;
        for (T fruit : fruits)
            totalWeight += fruit.getWeight();
        return totalWeight;
    }
    public boolean compare(Boxes<? extends Fruits> box) {
        return Float.compare(this.getWeight(), box.getWeight()) == 0;
    }
    public void addFruits(ArrayList<T> fruits) {
        this.fruits.addAll(fruits);
    }
    public void moveAllToNextBox(Boxes<T> box) {
        box.addFruits(getFruits());
        fruits.clear();
    }

}
