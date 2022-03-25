package HomeWork2_1_task3;

public class Player3 implements Playable {

    private Integer runLimit;
    private Integer jumpLimit;
    private Integer swimLimit;
    private boolean play;

    public Player3(Integer runLimit, Integer jumpLimit, Integer swimLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.swimLimit = swimLimit;
    }

    @Override
    public void run(Track track) {
        if (runLimit < track.getLength()){
            System.out.println("Не смог пробежать");
            play = false;
        } else {
            System.out.println("Пробежал");
            play = true;
        }
    }

    @Override
    public void jump(Wall wall) {
        if (runLimit < wall.getLength()){
            System.out.println("Не смог перепрыгнуть");
            play = false;
        } else {
            System.out.println("Перепрыгнул");
            play = true;
        }
    }

    @Override
    public void swim(Pool pool) {
        if (runLimit < pool.getLength()){
            System.out.println("Не смог проплыть");
            play = false;
        } else {
            System.out.println("Проплыл");
            play = true;
        }

    }

    @Override
    public boolean checkWin(boolean play) {
        if (play == false){
            return false;
        }
        return true;
    }

}
