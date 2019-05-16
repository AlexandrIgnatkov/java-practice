package practice.hw_7;


public class AnimalPrint {
    private Animal animal;
    private Animal animal1;
    private Animal animal2;

    public AnimalPrint(Animal animal) {
        this.animal = animal;
    }

    public AnimalPrint(Animal animal, Animal animal1) {
        this.animal = animal;
        this.animal1 = animal1;
    }

    public AnimalPrint(Animal animal, Animal animal1, Animal animal2) {
        this.animal = animal;
        this.animal1 = animal1;
        this.animal2 = animal2;
    }

    public void printInfo() {
        if (animal != null)
            System.out.println();
            System.out.print("Name: " + animal.getName() + "\tAge: " + animal.getAge() + "\tPedigree: " + animal.getPedigree());
        if (animal1 != null)
            System.out.println();
        System.out.print("Name: " + animal1.getName() + "\tAge: " + animal1.getAge() + "\tPedigree: " + animal1.getPedigree());
        if (animal2 != null)
            System.out.println();
        System.out.print("Name: " + animal2.getName() + "\tAge: " + animal2.getAge() + "\tPedigree: " + animal2.getPedigree());

    }

}
