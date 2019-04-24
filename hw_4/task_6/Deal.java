package practice.hw_4.task_6;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Deal {
    public static void main(String[] args) {
        String[] koloda = new String[52]; //массив колода
        int razd = 5; //количество карт в раздаче
        Scanner sc = new Scanner(System.in);                // ввод количества игроков
        System.out.println("Введите количество игроков");
        int player = 0;
        player = sc.nextInt();
        while (player < 2 && player > koloda.length / razd) {
            System.out.println("Повторите ввод");
            player = sc.nextInt();
        }
        System.out.println("Количество игроков: " + player);

        //задаем массивы мастей и карт

        String[] masty = {"Пики", "Червы", "Бубны", "Трефы"};
        String[] karty = {"Двойка", "Тройка", "Четверка", "Пятерка", "Шестерка", "Семерка", "Восьмерка",
                "Девятка", "Десятка", "Валет", "Дама", "Король", "Туз"};
        int k = 0; //счетчик массива колода
        for (int i = 0; i < karty.length; i++) {
            for (int j = 0; j < masty.length; j++) {
                koloda[k] = karty[i] + " " + masty[j];
                k++;
            }
        }

        // сортируем колоду


        int index;
        String temp;
        Random random = new Random();
        for (int i = koloda.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            temp = koloda[index];
            koloda[index] = koloda[i];
            koloda[i] = temp;
        }
        System.out.println("Карты в колоде");
        System.out.println(Arrays.toString(koloda));
        System.out.println();


        //раздача карт

        int h =0;
        String[][] playerName = new String[player][razd];
        for (int i = 0; i < player; i++){
            for (int j = 0; j < razd; j++){
            playerName[i][j]=koloda[h];
            h++;
            }

        }


        //вывод на экран раздачи


        for (int i = 0; i < playerName.length; i++) {
            System.out.print("Карты игрока " + (i+1) + ": ");
            System.out.println(Arrays.toString(playerName[i]));
            System.out.println();
        }

    }
}
