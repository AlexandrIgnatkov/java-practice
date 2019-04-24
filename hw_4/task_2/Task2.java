package practice.hw_4.task_2;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int min = 0;
        int max = 5;
        int sum1 = 0;
        int sum2 = sum1;
        Random random = new Random();
        for (int i = 0; i < array1.length; i++) {                       //задаем элеметы массива
            array1[i] = random.nextInt((max - min) + 1) + min;  //
            array2[i] = random.nextInt((max - min) + 1) + min; //
        }
        System.out.println(Arrays.toString(array1));//преобразуем массив в строку и выводим на экран
        System.out.println(Arrays.toString(array2));
        double average1;
        double average2;
        for (int x : array1) {
            sum1 += x;
        }
        for (int x : array2) {
            sum2 += x;
        }
        average1 = (double) sum1 / array1.length;
        average2 = (double) sum2 / array2.length;
        System.out.println("Среднее арифметическое элементов массива 1: " + average1);
        System.out.println("Среднее арифметическое элементов массива 2: " + average2);

        if (average1 > average2) {
            System.out.println("Среднее арифметическое массива 1 больше массива 2");
        }
         else   if (average2 > average1){
            System.out.println("Среднее арифметическое массива 2 больше массива 1");

        }
         else System.out.println("Среднее арифметическое массивов раны");
    }
}
