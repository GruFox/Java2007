package lesson1_6;

public class Cabrio extends Car {
    boolean hasHandTop;

    public Cabrio(String model, int year, boolean hasHandTop) {
       super(model,year);
        this.hasHandTop = hasHandTop;
    }


    public boolean isHasHandTop() {
        return hasHandTop;
    }

    public void setHasHandTop(boolean hasHandTop) {
        this.hasHandTop = hasHandTop;
    }

    @Override
    void printName() {
        super.printName();
    }
}
