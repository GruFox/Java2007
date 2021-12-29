package lesson1_2;

public class MethodApp {



    public static void main(String[] args) {

        int v1 = multiplication(4, 10);
        int v2 = multiplication(5, 6.0);


        PrintUtil.printFormatted("v1 = " + v1 + " v2 = " + v2 + " v3 = " + multiplication(v1, v2));

        PrintUtil.printFormatted("string to format");



    }

    public static int multiplication(int n1, int n2){
        int result = n1 *n2;
        return result;
    }

    public static int multiplication(int n1, double n2) {
        return (int) (n1 * n2);
    }


}
