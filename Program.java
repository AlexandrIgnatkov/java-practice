package practice;
public class Program {
    
    // Называй пожалуйста джава файлы соот-но номеру задания
    // например, public class Program -> public class Task_1
    
    //Это хорошо, что ты знаешь про классы, но в данной ситуации это необоснованное усложнение программы.
    // Лучше сделать static метод display(String message) и там выводить строку на экран. 
    // + раз уж ты сделал доп класс, то никакого хардкода не должно быть. Сообщение надо передавать через командную строку
    // или при помощи класса Scanner, если знаешь про такой
    public static void main(String[] args) {
        Bang bang = new Bang();
        bang.hello();

    }
}
