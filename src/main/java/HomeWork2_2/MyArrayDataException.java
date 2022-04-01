package HomeWork2_2;

public class MyArrayDataException extends ArrayStoreException {
    public MyArrayDataException() {
        super("Присваивание элементу массива объекта несовместимого типа");
    }
}
