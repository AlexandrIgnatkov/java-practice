package practice.hw_8.task1;

import java.util.Scanner;

/* думаю целый класс не нужен. + ты каждый раз создаешь     
Scanner scan = new Scanner(System.in);
когда вызываешь метод, это очень плохо, одного раза должно быть достаточно
*/

public class Input {
   // имя метода с опечаткой
   public int inputHosue(){
       boolean condition = true;
       int num = 0;
      // while(true) - ты все равно из цикла через break выходишь, переменная condition не нужна
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
