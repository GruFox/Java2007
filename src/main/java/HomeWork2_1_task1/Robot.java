package HomeWork2_1_task1;

public class Robot implements Actions {
    @Override
    public void run() {
        System.out.println("Робот умеет бегать");
    }
    @Override
    public void jump() {
        System.out.println("Робот умеет прыгать");
    }
}