package HomeWork2_1_task1;

public class Cat implements Actions {
    @Override
    public void run() {
        System.out.println("Кот умеет бегать");
    }
    @Override
    public void jump() {
        System.out.println("Кот умеет прыгать");
    }
}