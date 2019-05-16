package practice.hw_7;

class Dog extends Animal {
    private String tailLength;
    private String size;
    public Dog(String name, int age, String pedigree, String tailLength, String size){
        super(name, age, pedigree);
        this.size = size;
        this.tailLength = tailLength;
    }

    public String getSize() {
        return size;
    }

    public String getTailLength() {
        return tailLength;
    }

    @Override
    public void displayInfo() {
        System.out.println();
        super.displayInfo();
        System.out.print("Длина: " + getTailLength()+ "\tРазмер: " + getSize());
    }
}
