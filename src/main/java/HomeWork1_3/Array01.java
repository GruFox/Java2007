package HomeWork1_3;

public class Array01 {
    public static void main(String[] args) {
        int[] array = {1, 0, 1, 0, 1, 0, 1, 0, 1, 0};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else if (array[i] == 0) {
                array[i] = 1;
            }
            System.out.print(array[i] + " ");
        }
    }
}
