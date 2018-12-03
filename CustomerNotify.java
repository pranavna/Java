
public class CustomerNotify extends Observer{

   public CustomerNotify(Car car){
      this.car = car;
      this.car.attach(this);
   }

   public void update() {
      // Update logic
   }

    public void notifyCustomer() {
	  //Notify logic
   }
}
