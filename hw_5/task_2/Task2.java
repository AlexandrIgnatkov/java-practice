package practice.hw_5.task_2;


import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        String wordToFind = "apple";
        metod(args, wordToFind);
    }

    // не стоит называть метод методом -> check, contains - имя должно говорить что метод делает

    //слово method пишется с буквой H
    static void metod(String[] args1, String find) {
        // да, но решение не оптимально
        
        /* Arrays.asList(args1); - вернет тебе ArrayList, а если ты посмотришь в реализацию метода contains у ArrayList,
        то увидишь что он бежит по всему листу и ищет совпадение. Тоже самое и нужно сделать тебе, а не создавать доп лист
        */
        List valid = Arrays.asList(args1);
        if (valid.contains(find)) {
            System.out.println("true");;
        } else {
            System.out.println("false");;
        }
    }
}
