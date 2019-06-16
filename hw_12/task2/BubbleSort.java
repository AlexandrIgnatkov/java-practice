package practice.hw_12.task2;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        for (int i = arr.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
        System.out.println("Отсортированный массив");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
