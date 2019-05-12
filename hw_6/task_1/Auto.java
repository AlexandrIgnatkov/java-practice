package practice.hw_6.task_1;

public class Auto {
   // пользуйся переводчиком, но не называй переменные на русском.
   // motor - это должен быть отдельный класс Motor, у которого свои методы и экземпляр которого (через new Motor(), например
   // ты затем передашь классу Auto, т.е.
   /*
   public class Motor {
      --- твой код здесь ---
   }
   
   public static void main(String[] args) {
         Motor motor = new Motor();
         Car car = new Car(motor, transmission);  <- transmission тоже отдельный класс по принципу с Motor
         ---  код по управлению авто ---
   }
   */
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
