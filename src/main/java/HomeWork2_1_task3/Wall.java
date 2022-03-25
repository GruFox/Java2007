package HomeWork2_1_task3;

public class Wall implements Obstacle {

    private Integer  length;

    public Wall(Integer length) {
        this.length = length;
    }

    @Override
    public void overcome(Playable player) {
        player.jump(this);
    }

    public Integer getLength() {
        return length;
    }
}
