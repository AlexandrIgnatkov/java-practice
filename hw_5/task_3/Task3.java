package practice.hw_5.task_3;

public class Task3 {

    public static void main(String[] args) {
        int[] myArray = {12, 32, 3432, 232, 312};
        int n = myArray.length;
        int i =0;
        System.out.println(n);
        index(i,n,myArray);
    }

    static void index(int i, int w, int[] array) {
        if (w>0){
            w--;
            System.out.println(array[i]);
            i++;
            index(i, w, array);
        }
    }


}
