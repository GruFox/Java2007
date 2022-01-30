package HomeWork1_7;

public class Cat {

    private final int catEat;
    private boolean fullness;

    public Cat(int catEat) {
        this.catEat = catEat;
    }

    public int getCatEat() {
        return catEat;
    }

    public void takeEat(Plate plate) {
        if(plate.refill(catEat) < 0){   // Почему-то метод 2 раза из тарелки списывает еду для кота, дебаг мне не помог...
            fullness = false;
        } else {
            fullness = true;
        }
    }

    public void info() {
        System.out.println("Cat ate = " + this.fullness);
    }
}
