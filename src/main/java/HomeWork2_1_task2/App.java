package HomeWork2_1_task2;

//Создайте два класса: беговая дорожка и стена, при прохождении через которые участники должны выполнять
//соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль
//(успешно пробежал, не смог пробежать и т.д.)

public class App {
    public static void main(String[] args) {

        Track track = new Track(20);
        Wall wall = new Wall(1.5);

        Player player1 = new Player(20, 1.2);
        player1.resultRun(track);
        player1.resultJump(wall);

        Player player2 = new Player(15, 1.6);
        player2.resultRun(track);
        player2.resultJump(wall);
    }
}
