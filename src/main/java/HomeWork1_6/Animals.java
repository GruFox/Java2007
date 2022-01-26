package HomeWork1_6;

import lesson1_6.Car;

public class Animals {

    private String animal;
    private String name;
    private String action;
    private int distance;

    public Animals(String animal, String name, String action, int distance) {
        this.animal = animal;
        this.name = name;
        this.action = action;
        this.distance = distance;

        compareAnimals();

    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public void compareAnimals() {
        if (this.animal.equals("cat")){
            if (this.action.equals("run")){
                compareDistanceRun();
            } else {
                compareDistanceSwim();
            }
        } else {
            if (this.action.equals("run")){
                compareDistanceRun();
            } else {
                compareDistanceSwim();
            }
        }
    }

    public void compareDistanceRun() {
        if (this.animal.equals("cat")) {
            if(this.distance <= 200){
                System.out.println(name + " пробежал " + distance + " м.");
            }
        } else {
            if (this.distance <= 500) {
                System.out.println(name + " пробежал " + distance + " м.");
            }
        }
    }
    public void compareDistanceSwim() {
        if (this.animal.equals("cat")) {
            System.out.println(name + " не умеет плавать!");
        } else {
            if (this.distance <= 10) {
                System.out.println(name + " проплыл " + distance + " м.");
            }
        }
    }
}
