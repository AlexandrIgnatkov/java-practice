package practice.hw_12.task2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class ArraySort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
    final String PATH = "C:\\Users\\agent\\IdeaProjects\\Practice\\src\\practice\\hw_12\\task2\\task2";
    try (BufferedReader br = new BufferedReader(new FileReader(PATH))) {
        String str;
        System.out.println("Начальный массив");
        ArrayList<String> list = new ArrayList<String>();
        while((str = br.readLine()) != null ){
            if(!str.isEmpty()){
                list.add(str);
                System.out.println(str);
            }}
        int[] arr = list.stream().mapToInt(i -> Integer.parseInt(i)).toArray();

        bubbleSort.bubbleSort(arr);
        } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}
