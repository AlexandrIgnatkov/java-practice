package practice.hw_8.task1;

public class House {
    private int floor;
    private int design;

    public House(int floor, int design) {
        this.design = design;
        this.floor = floor;
    }
    
    // для таких целей стоить переопределять метод toString()
    public void printHouse(){
        System.out.print("Дизайн дома: ");
        if (design==1){
            System.out.println("стандартный");
        }else System.out.println("хайтек");
        System.out.println("Количество этажей: " + floor);
    }

}
