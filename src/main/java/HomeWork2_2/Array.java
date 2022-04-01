package HomeWork2_2;

//Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При
//подаче массива другого размера необходимо бросить исключение MyArraySizeException.

//Далее метод должен пройтись по всем элементам массива, преобразовать в int и
//просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
//ячейке лежит символ или текст вместо числа), должно быть брошено исключение
//MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.

//В методе main() вызвать полученный метод, обработать возможные исключения
//MyArraySizeException и MyArrayDataException и вывести результат расчета (сумму элементов,
//при условии что подали на вход корректный массив).

public class Array {

    public static void main(String[] args){

        String[][] arr;
        try {
            method(new String[4][4]);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

    }

    public static void method(String[][] array) throws MyArraySizeException {

        if (array.length != 4 || array[3].length != 4){
            throw new MyArraySizeException(array);
        }
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                Integer.parseInt(array[i][j]);
                } catch (MyArrayDataException b) {
                }
                a += Integer.parseInt(array[i][j] = "1");

            }
        }
        System.out.print(a);
    }
}

