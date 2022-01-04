package HomeWork1_3;

public class ArrayMinMax {
    public static void main(String[] args) {

        int[] array = {2, 4, 6, 8, 12, 10, 9, 1};
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("максимальное значение массива = " + max);

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("минимальное значение массива = " + min);
    }
}

