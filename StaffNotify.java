
public class StaffNotify extends Observer{

   public StaffNotify(Car car){
      this.car = car;
      this.car.attach(this);
   }

   public void update() {
      // Update logic
   }

   public void notifyStaff() {
	   //Notify logic
   }
}
