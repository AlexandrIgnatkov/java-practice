package practice.hw_5.task_1;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        vvod();
        shar();
    }
    static void vvod(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте вопрос");
        String question;
        question = sc.next();
        while (question.charAt(question.length()-1) != '?' ){
            System.out.println("Задайте вопрос еще раз");
            question = sc.next();
        }
        System.out.println(question);
    }


    static void shar(){
        String[] texts = {"Сбудится", "Не сбудится"};
        Random random = new Random ();
        int pos = random.nextInt(texts.length);
        System.out.print(texts[pos]);
    }
}
