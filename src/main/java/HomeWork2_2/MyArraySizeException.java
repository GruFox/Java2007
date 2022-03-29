package HomeWork2_2;

public class MyArraySizeException extends Exception {

    public MyArraySizeException(String[][] array){
        super("Массив не соответствует размеру!");
    }

}
