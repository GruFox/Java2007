package HomeWork2_1_task1;

// Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
// Эти классы должны уметь бегать и прыгать.
// (методы просто выводять информацию о действии в консоль).

public class App {
    public static void main(String[] args) {
        Actions human = new Human();
        human.jump();
        human.run();
        Actions cat = new Cat();
        cat.jump();
        cat.run();
        Actions robot = new Robot();
        robot.jump();
        robot.run();
    }
}
