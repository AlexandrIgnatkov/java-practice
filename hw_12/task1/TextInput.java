package practice.hw_12.task1;

import java.io.*;

public class TextInput {
    public static void main(String[] args) {
        int i=0;
        final String PATH = "C:\\Users\\agent\\IdeaProjects\\Practice\\src\\practice\\hw_12\\task1\\task1.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(PATH))) {
            int textRead;
            while ((textRead = br.read()) != -1) {
                if (textRead == 32){
                    System.out.print(",");
                    i++;
                }
                System.out.print((char) textRead);
                if (i == 5){
                    System.out.println();
                    i=0;
                }
            }


        } catch (IOException e) {
            System.out.println("Ошибка");
        }
    }
}


