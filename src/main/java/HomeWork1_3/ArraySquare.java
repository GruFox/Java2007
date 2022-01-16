package HomeWork1_3;

import java.util.Arrays;

public class ArraySquare {
    public static void main(String[] args) {
        int[][] square = new int[10][10];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                if (i == j) {
                    square[i][j] = 1;
                } else if (i + j == square[i].length - 1) {
                    square[i][j] = 1;
                }
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }
}
