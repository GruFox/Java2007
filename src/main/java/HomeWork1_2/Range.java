package HomeWork1_2;

public class Range {
    public static void main(String[] args) {

        System.out.println(sum(6,6));
    }

    public static boolean sum(int a, int b) {
        int c = a + b;
        if(c >= 10 && c <= 20){
            return true;
        }else{
            return false;
        }
    }
}
