package lesson1_6;

public class Bike extends Transport{
    int wheelsNumber;

    public Bike(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    @Override
    public void wroomWroom() {
        System.out.println("Bzzzz");
    }

    @Override
    public void printInventionDate() {
        System.out.println("1950");
    }
    public final boolean requireHelmet() {
        return true;
    }
}
