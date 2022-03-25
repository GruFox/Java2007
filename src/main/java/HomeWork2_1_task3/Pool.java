package HomeWork2_1_task3;

public class Pool implements Obstacle {

    private Integer  length;

    public Pool(Integer length) {
        this.length = length;
    }

    @Override
    public void overcome(Playable player) {
        player.swim(this);
    }

    public Integer getLength() {
        return length;
    }
}
