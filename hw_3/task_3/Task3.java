package practice.hw_3.task_3;

public class Task3 {
    public static void main(String[] args) {
        String dog = "Whara is my dog+";
        
        // можно в одну строку dog.replace('a','e').replace('+','?')
        String repDog1 = dog.replace('a','e');
        String repDog2 = repDog1.replace('+','?');
        System.out.println(repDog2);
    }
}
