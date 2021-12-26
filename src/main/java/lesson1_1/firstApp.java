package lesson1_1;

public class firstApp {
    public static void main(String[] args) {
        System.out.println("Hello, java");

        int name = 10;

        double doubleVal = 10.0;

        int b = 100 + name;

        System.out.println("b = " + b);

        int c = name + b * 2;
        System.out.println("c = " + c);

        int a = 42;
        a++; // a = a + 1;
        a--;

        a += 10; // a = a + 10;
        a -= 10;
        a *= 10;
        a /= 10;

        //boolean boolValue = true;
        //System.out.println(boolValue);

        int v1 = 15;
        int v2 = 15;

        //boolean resalt = v1 > v2;
        //System.out.println(resalt);

        if (v1 > v2){
            System.out.println("v1 > v2");
        } else if (v1 < v2) {
            System.out.println("v1 < v2");
        } else {
            System.out.println("v1 = v2");
        }

        drawCat();
        drawCat();
        drawCat();
        drawCat();

    }

    public static void drawCat() {
        System.out.println("cat");
    }

}
