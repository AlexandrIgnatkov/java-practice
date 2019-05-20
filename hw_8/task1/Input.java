package practice.hw_8.task1;

import java.util.Scanner;

public class Input {
   // имя метода с опечаткой
   public int inputHosue(){
       boolean condition = true;
       int num = 0;
       while (condition) {
           Scanner scan = new Scanner(System.in);
           try { num = scan.nextInt();
               break;
           }catch (Exception e){
               System.out.println("Введите одну из цифр, указанных выше");}

       }
       return num;
   }
}
