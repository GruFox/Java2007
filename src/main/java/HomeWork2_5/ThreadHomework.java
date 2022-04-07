package HomeWork2_5;

import java.util.Arrays;

public class ThreadHomework {
    public static void main(String[] args) {
        final ThreadHomework threadHomework = new ThreadHomework();
        final FirstMethod t1 = new FirstMethod();
        final SecondMethod t2 = new SecondMethod();
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class FirstMethod extends Thread {
    @Override
    public void run() {
        int size = 10_000_000;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Общее время первого потока: " + (System.currentTimeMillis() - startTime) + " ms.");
    }
}

class SecondMethod extends Thread {
     @Override
     public void run() {
         int size = 10_000_000;
         float[] arr = new float[size];
         for (int i = 0; i < arr.length; i++) {
             arr[i] = 1.0f;
         }
         long startTime1 = System.currentTimeMillis();
         //System.out.println(Arrays.toString(arr));
         long startTime2 = System.currentTimeMillis();
         float[] leftHalf = new float[5_000_000];
         System.arraycopy(arr, 0, leftHalf, 0, 5_000_000);
         for (int i = 0; i < leftHalf.length; i++) {
             leftHalf[i] = (float) (leftHalf[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
         }
         //System.out.println(Arrays.toString(leftHalf));
         System.out.println("Время выполнения левой части массива: " + (System.currentTimeMillis() - startTime2) + " ms.");

         long startTime3 = System.currentTimeMillis();
         float[] rightHalf = new float[5_000_000];
         System.arraycopy(arr, 5_000_000, rightHalf, 0, 5_000_000);
         for (int i = 0; i < rightHalf.length; i++) {
             rightHalf[i] = (float) (rightHalf[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
         }
         //System.out.println(Arrays.toString(rightHalf));
         System.out.println("Время выполнения правой части массива: " + (System.currentTimeMillis() - startTime3) + " ms.");

         float[] mergedArray = new float[10_000_000];
         System.arraycopy(leftHalf, 0, mergedArray, 0, 5_000_000);
         System.arraycopy(rightHalf, 0, mergedArray, 5_000_000, 5_000_000);
         //System.out.println(Arrays.toString(mergedArray));
         System.out.println("Общее время второго потока: " + (System.currentTimeMillis() - startTime1) + " ms.");
     }
 }
