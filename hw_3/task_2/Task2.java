package practice.hw_3.task_2;

import java.math.BigDecimal;

public class Task2 {
    public static void main(String[] args) {
        BigDecimal number2 = new BigDecimal("1.254545");
        BigDecimal number1 = new BigDecimal("1.25454");
        BigDecimal sum;
        sum = number1.add(number2);
        System.out.println(number1 + " + " + number2 + " = " + sum);
    }
}
