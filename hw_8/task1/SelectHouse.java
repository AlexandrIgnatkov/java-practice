package practice.hw_8.task1;

// SelectHouse пришлось гуглить, но вроде есть такой дом. Вообще имя класса - это имя существительное
public class SelectHouse extends House {
    private int garage;
    private int fence;

    public SelectHouse(int floor, int design, int garage, int fence) {
        super(floor, design);
        this.fence = fence;
        this.garage = garage;
    }
    @Override
    public void printHouse(){
        super.printHouse();
        if (this.garage == 1){
            System.out.println("Имется гараж");}
        if (this.fence == 1){
            System.out.println("Имеется забор");
        }
    }
}
