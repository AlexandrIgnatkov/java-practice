package practice.hw_8.task1;

public class Task_1 {
    public static void main(String[] args) {
        Input input = new Input();
        
        System.out.print("Введите дизайн дома:\n1 - Стандартный;\n2 - Хайтек.\n");
        int design = input.inputHosue();
        
        System.out.println("Введите этажность дома: ");
        int floor = input.inputHosue();
        
        System.out.println("Наличие гаража?\n1 - да;\n2 - нет.");
        int garage = input.inputHosue();
        
        System.out.println("Наличие забора?\n1 - да;\n2 - нет.");
        int fence = input.inputHosue();
       
        SelectHouse selectHouse = new SelectHouse(floor, design, garage, fence);
        selectHouse.printHouse();
    }
}

  
