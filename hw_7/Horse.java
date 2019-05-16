package practice.hw_7;

class Horse extends Animal{
    private String height;
    private Boolean wearsHorseShoe;
    public Horse(String name, int age, String pedigree, String height, Boolean wearsHorseShoe){
        super(name, age, pedigree);
        this.height = height;
        this.wearsHorseShoe = wearsHorseShoe;
    }

    public Boolean getWearsHorseShoe() {
        return wearsHorseShoe;
    }

    public String getHeight() {
        return height;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.print("\tВысота: "+ getHeight() +  "\tНосит ли подковы? " + getWearsHorseShoe());
    }
}
