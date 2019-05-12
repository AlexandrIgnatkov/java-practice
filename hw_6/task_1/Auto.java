package practice.hw_6.task_1;

public class Auto {
   private int motor = 0;
   private int kpp = 0;
   private int speed = 0;
   public void onMotor(){
       if (this.motor==0){
           this.motor=1;
       }
       else System.out.println("Мотор уже заведен");

   }
   public void offMotor(){
       if (this.motor==1){
           this.motor=0;
       }
       else System.out.println("Мотор уже заглушен");

   }
   public void upKpp() {
       if (this.kpp < 7){
           this.kpp++;
       }

   }
   public void downKpp(){
       if (this.kpp > 0){
           this.kpp--;
       }
   }

   public void drivingSeed(){
       if (this.motor==1 && this.kpp > 0){
       this.speed = this.kpp * 20;
           System.out.println("Текущая скорость " + this.speed);
       }
       else System.out.println("Автомобить не движется");

   }


}
