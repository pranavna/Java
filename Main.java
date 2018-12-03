public class Application
{
	public static void main()
	{
		// Create customer object and call methods to simulate the menu flow
	}
	
}

public class Customer
{
	
	Customer()
	{
		// Constructor
	}
	
	public getInput()
	{
		// Display menu options, take user input and call other methods based on input
	}
	
	public SearchCar()
	{
		// Take user input and display Cars available based on preferences
	}
	
	public ReserveCar()
	{
		// Take user input for car, location and payment preferences
	}
	
	public MakePayment()
	{
		// Take user input to record payment
	}
	
}


public interface PaymentStrategy
{
	public void pay(int amount);
}

public class CreditCard implements PaymentStrategy
{
	public void pay(float amount)
	{
		// Credit Card implementation for Payment
	}
}

public class PayPal implements PaymentStrategy
{
	public void pay(float amount)
	{
		// Paypal implementation for Payment
	}
}

public class Cash implements PaymentStrategy
{
	public void pay(float amount)
	{
		// Cash implementation for Payment
	}
}


public interface InsuranceStrategy
{
	public void getCoPay();
}

public class CDWInsurance implements InsuranceStrategy
{
	public void getCoPay()
	{
		// CDWInsurance calculation for CoPay
	}
}

public class LiabilityInsurance implements InsuranceStrategy
{
	public void getCoPay()
	{
		// LiabilityInsurance calculation for CoPay
	}
}

public class TheftInsurance implements InsuranceStrategy
{
	public void getCoPay()
	{
		// TheftInsurance calculation for CoPay
	}
}



// Factory

public class CarFactory{
	public abstract Car getCar();	
}

public class HatchBackCarCreator{
	public Car getCar(){
		return new HatchBackCar();
	}
	
}


public class SedanCarCreator{
	public Car getCar(){
		return new SedanCar();
	}
	
}


public class SUVCarCreator{
	public Car getCar(){
		return new SUVCar();
	}
	
}

public class CovertibleCarCreator{
	public Car getCar(){
		return new CovertibleCar();
	}
	
}

//Cars

public abstract class Car{
	abstract float getRentalPrice()
	abstract boolean getAvailability()
	abstract void updateAvailability()
	
	
	// Observer Code
	public int getState() {
      return state;
   }

   public void setState(int state) {
      this.state = state;
      notifyAllObservers();
   }

   public void attach(Observer observer){
      observers.add(observer);		
   }

   public void notifyAllObservers(){
      for (Observer observer : observers) {
         observer.update();
      }
   } 	
	
	
}


public class HatchBackCar extends Car{
	public float getRentalPrice(){
		// insert logic
	}
	public boolean getAvailability(){
		// insert logic
	}
		
	public void updateAvailability(){
		// insert logic
	}

}

public class SedanCar extends Car{
	public float getRentalPrice(){
		// insert logic
	}
	public boolean getAvailability(){
		// insert logic
	}
		
	public void updateAvailability(){
		// insert logic
	}

}

public class SUVCar extends Car{
	public float getRentalPrice(){
		// insert logic
	}
	public boolean getAvailability(){
		// insert logic
	}
		
	public void updateAvailability(){
		// insert logic
	}

}

public class ConvertibleCar extends Car{
	public float getRentalPrice(){
		// insert logic
	}
	public boolean getAvailability(){
		// insert logic
	}
		
	public void updateAvailability(){
		// insert logic
	}

}

//Observer

public abstract class Observer {
   protected Car car;
   public abstract void update();
}

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
