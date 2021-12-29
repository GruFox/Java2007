package HomeWork1_1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords(){
        System.out.println("Orange\nBanana\nApple");
    }
    public static void printColor(){
        int value = 101;
        if (value <= 0){
            System.out.println("Красный");
        }else if (value > 0 && value <= 100){
            System.out.println("Желтый");
        }else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(){
        int a = 2;
        int b = 4;
        if (a >= b){
            System.out.println("a >= b");
        }else{
            System.out.println("a < b");
        }
    }

}
