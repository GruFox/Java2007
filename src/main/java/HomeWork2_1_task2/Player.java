package HomeWork2_1_task2;

public class Player {

    private int abilityRun;
    private double abilityJump;

    public Player(int abilityRun, double abilityJump) {
        this.abilityRun = abilityRun;
        this.abilityJump = abilityJump;
    }

    public void resultRun(Track run) {
        if (this.abilityRun >= run.getValue()) {
            System.out.println("Участник успешно пробежал " + run.getValue() + " метров!");
        } else {
            System.out.println("Участник не смог пробежать " + run.getValue() + " метров!");
        }
    }
    public void resultJump(Wall jump) {
        if (this.abilityJump > jump.getValue()) { // не ставил =, тк чтобы перепрыгруть, надо прыгать выше
            System.out.println("Участник успешно перепрыгнул " + jump.getValue() + " метра!");
            System.out.println();
        } else {
            System.out.println("Участник не смог перепрыгнуть " + jump.getValue() + " метра!");
            System.out.println();
        }
    }
}


