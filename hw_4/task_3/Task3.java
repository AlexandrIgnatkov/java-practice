package practice.hw_4.task_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);                // ввод размерности массива
        System.out.println("Введите размер массива:");
        int size = 0;
        size = sc.nextInt();
        while (size < 1) {
            System.out.println("Повторите ввод");
            size = sc.nextInt();
        }
        System.out.println("Размер массива: " + size);


        int[] array = new int[size];                                // задание элементов массива [0;size]
        int min = 0;
        int max = size;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
        }
        System.out.print("Элементы массива: ");
        System.out.println(Arrays.toString(array));



        int kol = 0;                    // нахожденеие количества четных элементов массива
        for (int x: array){
            if ((x%2)==0)
            kol++;
        }

        int[] array2 = new int[kol];          //создаем массив для ченых элементов
        int j = 0;
        if (kol!=0) {
            for (int i = 0; i < array.length; i++) {  // заполняем массив
                if (array[i] % 2 == 0) {
                    array2[j] = array[i];
                    j++;
                }
            }
            System.out.print("Четные эементы массива: ");
            System.out.println(Arrays.toString(array2));
        }
        else System.out.println("В массиве четных элементов нет");


    }
}
