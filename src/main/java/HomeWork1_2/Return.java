package HomeWork1_2;

public class Return {
    public static void main(String[] args) {

        System.out.println(ifNumPositive(-2));
    }
    public static boolean ifNumPositive(int a){
        if (a < 0) {
            return true;
        } else{
            return false;
        }
    }

}
