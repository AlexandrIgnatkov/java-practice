package practice.hw_7;

class Cat extends Animal {
    public String mustacheSize;
    public String clawSharpness;

    public Cat(String name, int age, String pedigree, String mustacheSize, String clawSharpness) {
        super(name, age, pedigree);
        this.mustacheSize = mustacheSize;
        this.clawSharpness = clawSharpness;
    }

    public String getClawSharpness() {
        return clawSharpness;
    }

    public String getMustacheSize() {
        return mustacheSize;
    }

    @Override
    public void displayInfo() {
        System.out.println();
        super.displayInfo();
        System.out.print("\tРазмер усов: " + getMustacheSize() + "\tОстрота когтей: " + getClawSharpness());
    }
}
