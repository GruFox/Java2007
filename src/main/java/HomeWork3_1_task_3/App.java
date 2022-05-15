package HomeWork3_1_task_3;

public class App{
    public static void main(String[] args){
        Boxes<Apples> appleBoxes = new Boxes<>();
        Boxes<Oranges> orangesBoxes = new Boxes<>();
        for (int i = 0; i < 3; i++) {
            appleBoxes.addInBox(new Apples());
            orangesBoxes.addInBox(new Oranges());
        }

        System.out.println("Коробка с яблоками: " + appleBoxes.getFruits());
        System.out.println("Коробка с апельсинами: " + orangesBoxes.getFruits());
        System.out.println("Вес коробки с яблоками = " + appleBoxes.getWeight());
        System.out.println("Вес коробки с апельсинами = " + orangesBoxes.getWeight());
        System.out.println("Сравним коробки: " + appleBoxes.compare(orangesBoxes));

        appleBoxes.addInBox(new Apples());
        appleBoxes.addInBox(new Apples());
        appleBoxes.addInBox(new Apples());
        orangesBoxes.addInBox(new Oranges());
        System.out.println("Вес коробки с яблоками = " + appleBoxes.getWeight());
        System.out.println("Вес коробки с апельсинами = " + orangesBoxes.getWeight());
        System.out.println("Сравним коробки: " + appleBoxes.compare(orangesBoxes));

        Boxes<Apples> applesBoxes2 = new Boxes<>();
        applesBoxes2.addInBox(new Apples());
        appleBoxes.moveAllToNextBox(applesBoxes2);
        System.out.println(appleBoxes.getFruits());
        System.out.println(applesBoxes2.getFruits());

    }
}
