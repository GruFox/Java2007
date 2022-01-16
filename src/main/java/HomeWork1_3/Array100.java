package HomeWork1_3;

import java.util.Arrays;

public class Array100 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + i;
        }
        System.out.println(Arrays.toString(array));
    }
}
