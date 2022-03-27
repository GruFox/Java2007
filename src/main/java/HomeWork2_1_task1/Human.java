package HomeWork2_1_task1;

public class Human implements Actions {
    @Override
    public void run() {
        System.out.println("Человек умеет бегать");
    }
    @Override
    public void jump() {
        System.out.println("Человек умеет прыгать");
    }
}


