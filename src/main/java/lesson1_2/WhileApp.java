package lesson1_2;

public class WhileApp {
    public static void main(String[] args) {

        int i = 10; // test
        while (i > 0){
            System.out.println(i);
            i--;
        }

        int j = -10;
        do {
            System.out.println("j=" + j);
            j--;
        } while (j > 0);
    }
}