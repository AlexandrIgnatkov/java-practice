package practice.hw_4.task_4;

public class Task4 {
    public static void main(String[] args) {
    String[] original = {"Каждый", "охотник", "желает", "знать", "где", "сидит", "фазан"};
    String temp;
//выводим первоначальную строку
    for (String x: original){
        System.out.print(x + " ");
    }
//элементы массива меняем местами
    for (int i = 0; i<original.length/2; i++){
        temp = original[i];
        original[i]=original[original.length-i-1];
        original[original.length-i-1]= temp;
    }
    //выводим получившийся массив
        System.out.println();
    for (String x: original) {
            System.out.print(x + " ");
        }
    }
}
