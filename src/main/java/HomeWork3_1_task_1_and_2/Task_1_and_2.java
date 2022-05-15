package HomeWork3_1_task_1_and_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_1_and_2 {
    public static void main(String[] args) {
        String[] value = new String[] {"будешь", "предан"};
        method1(value);
        method2(value);
    }

    public static void method1(String[] arr){
        System.out.println("Исходник: " + Arrays.toString(arr));
        String[] arr2 = new String[2];
        if(arr[0].equals(arr[0])){
            arr2[0] = arr[1];
            arr2[1] = arr[0];
        }
        System.out.println("Первый метод: " + Arrays.toString(arr2));
    }
    // Может я и схитрил малость, но это то, на что у меня хватило мозгов...
    // Надеюсь, вы наверняка покажите более легкий и правильный способ.

    public static void method2(String[] arr3){
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < arr3.length; i++) {
            arrayList.add(i, arr3[i]);
        }
        System.out.println("Второй метод: " + arrayList);
    }
}
