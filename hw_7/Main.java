package practice.hw_7;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Жучка", 12, "Овчарка", "120", "20");
        dog.displayInfo();
        Cat cat = new Cat("Барсик", 1, "Фараон", "14", "12");
        cat.displayInfo();
        Horse horse = new Horse("Конь",14, "Тяжеловес", "170", true);
        horse.displayInfo();
        // --------------
        AnimalPrint animalPrint = new AnimalPrint(dog, cat, horse);
        animalPrint.printInfo();
    }
}
