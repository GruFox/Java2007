package HomeWork2_1_task3;

// Создайте два массива: с участниками и препятствиями, и заставьте всех участников
// пройти этот набор препятствий.

public class App {
    public static void main(String[] args) {
        Playable[] players = new Playable[]{
                new Player1(2,2,2),
                new Player2(3,3,3),
                new Player3(5,5,5)
        };
        Obstacle[] obstacles = new Obstacle[]{
          new Track(2), new Wall(5), new Pool(3)
        };

        for (Playable player : players) {
            for (Obstacle obstacle : obstacles) {
                obstacle.overcome(player);
                //player.checkWin(false); не смог совладать с проверкой (4е задание)
            }
            System.out.println();
        }
    }
}
