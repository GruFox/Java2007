package HomeWork1_3;

import java.util.Arrays;

public class ArrayMethod {
    public static void main(String[] args) {


        System.out.print(Arrays.toString(method(5, 2)));
    }

    public static int[] method(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
