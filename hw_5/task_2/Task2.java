package practice.hw_5.task_2;


import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        String wordToFind = "apple";
        metod(args, wordToFind);
    }

    static void metod(String[] args1, String find) {
        List valid = Arrays.asList(args1);
        if (valid.contains(find)) {
            System.out.println("true");;
        } else {
            System.out.println("false");;
        }
    }
}
