package HomeWork2_1_task3;

public class Track implements Obstacle {

    private Integer  length;

    public Track(Integer length) {
        this.length = length;
    }

    @Override
    public void overcome(Playable player) {
        player.run(this);
    }

    public Integer getLength() {
        return length;
    }
}
