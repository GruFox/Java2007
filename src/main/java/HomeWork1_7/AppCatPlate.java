package HomeWork1_7;

public class AppCatPlate {

    public static void main(String[] args){

        Cat cat = new Cat(5);
        Cat cat2 = new Cat(10);
        Cat cat3 = new Cat(50);         // Не смог разобраться, почему фолс не выводит.
        Plate plate = new Plate(30);

        plate.info();
        plate.isFull(cat);
        cat.takeEat(plate);
        cat.info();
        System.out.println();

        plate.info();
        plate.isFull(cat2);
        cat2.takeEat(plate);
        cat.info();
        System.out.println();

        plate.info();
        plate.isFull(cat3);
        cat3.takeEat(plate);
        cat.info();

    }
}
