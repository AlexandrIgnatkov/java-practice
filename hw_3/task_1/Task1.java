package practice.hw_3.task_1;

public class Task1 {
    // это не ошибка, но лучше в сигнатуре метода main вообще ничего не менять myArgs -> args
    public static void main(String[] myArgs) {
        int number = Integer.parseInt(myArgs[0]);
        number = number << 8;
        System.out.println(number);
    }
}
