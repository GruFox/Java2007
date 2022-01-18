package HomeWork1_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CrossesZeroesAppUpdate {

    //Поле
    public static char[][] map;

    //Размер поля
    public static final int SIZE = 3;

    //Точек для победы
    public static final int DOTS_TO_WIN = 3;

    //Описание точек
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_0 = 'O';

    //Сканер
    public static final Scanner SCANNER = new Scanner(System.in);

    //рандом
    public static final Random RANDOM = new Random();

    /**
     * Проинициализировать поле
     */
    public static void initMap() {
        map = new char [SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            Arrays.fill(map[i], DOT_EMPTY);
        }
    }

    /**
     * Вывод игрового поля на экран
     */
    public static void printMap() {
        //нумеруем верхний ряд
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //пишем строки мапы
        for (int i = 0; i < map.length; i++) {
            //выводим номер строки
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Ход человека
     */
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    /**
     * Ход робота.
     */
    public static void aiTurn(){
        int x,y;
        do {
            x = RANDOM.nextInt(SIZE);
            y = RANDOM.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Робот делает ход в " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_0;
    }

    /**
     * Валидны ли значения поля
     * @param x координата X
     * @param y координата Y
     * @return да/нет
     */
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[y][x] != DOT_EMPTY){
            return false;
        }
        return true;
    }

    /**
     * Проверка победы.
     * @param symbol Символ, для которого проверяем. Крестик или нолик
     * @return true, если выиграл
     */
    public static boolean checkWin(char symbol) {

        // Первый способ

        /*for (int i = 0; i < map.length; i++){
            for (int j = 0; j <= 0; j++){
                if (map[i][j] == symbol && map[i][j + 1] == symbol && map[i][j + 2] == symbol){
                    return true;
                } else if (map[j][i] == symbol && map[j + 1][i] == symbol && map[j + 2][i] == symbol){
                    return true;
                } else if (map[j][j] == symbol && map[j + 1][j + 1] == symbol && map[j + 2][j + 2] == symbol){
                    return true;
                } else if (map[j][j + 2] == symbol && map[j + 1][j + 1] == symbol && map[j + 2][j] == symbol){
                    return true;
                }
            }
        }
        return false;*/


        // Второй способ. Они аналогичны, не знаю, зачем я сделал второй. Может какой-то из них более правильный..? Работают оба.

        for (int i = 0; i < map.length; i++){
            for (int j = 0; j <= 0; j++){
                if (map[i][j] == symbol && map[i][map[i].length - 2] == symbol && map[i][map[i].length - 1] == symbol){
                    return true;
                } else if (map[j][i] == symbol && map[map[i].length - 2][i] == symbol && map[map[i].length - 1][i] == symbol){
                    return true;
                } else if (map[j][j] == symbol && map[map[i].length - 2][map[i].length - 2] == symbol && map[map[i].length - 1][map[i].length - 1] == symbol){
                    return true;
                } else if (map[j][map[i].length - 1] == symbol && map[map[i].length - 2][map[i].length - 2] == symbol && map[map[i].length - 1][j] == symbol){
                    return true;
                }
            }
        }
        return false;

       /* //строки
        if (map[0][0] == symbol && map [0][1] == symbol && map[0][2] == symbol){
            return true;
        }
        if (map[1][0] == symbol && map [1][1] == symbol && map[1][2] == symbol){
            return true;
        }
        if (map[2][0] == symbol && map [2][1] == symbol && map[2][2] == symbol){
            return true;
        }
        //столбцы
        if (map[0][0] == symbol && map [1][0] == symbol && map[2][0] == symbol){
            return true;
        }
        if (map[0][1] == symbol && map [1][1] == symbol && map[2][1] == symbol){
            return true;
        }
        if (map[0][2] == symbol && map [1][2] == symbol && map[2][2] == symbol){
            return true;
        }
        //диагонали
        if (map[0][0] == symbol && map [1][1] == symbol && map[2][2] == symbol){
            return true;
        }
        if (map[0][2] == symbol && map [1][1] == symbol && map[2][0] == symbol){
            return true;
        }
        return false; */

    }



    /**
     * Проверка, что в поле не осталось ни одной свободной ячейки.
     * @return true, если нет ни одной свободной
     */
    public static boolean isMapFull() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Побеждает человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_0)) {
                System.out.println("Робот выиграл");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("Game over");
    }
}
