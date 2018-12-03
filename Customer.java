public class Customer
{

  public String name;

	public Customer(String name)
	{
		// Constructor
    this.name = name;
	}

	public void getInput()
	{
		// Display menu options, take user input and call other methods based on input

    System.out.println("\n************************************************************************************");
    System.out.println("\nHello "+this.name+",\nWhat would you like to do?");
    System.out.println("\nChoose option:\n\tS. Search for car at your nearest location.");
    System.out.println("\tR. Reserve a car.");
    System.out.println("\tP. Pay and check-out.");

    

	}

	public void SearchCar()
	{
		// Take user input and display Cars available based on preferences
	}

	public void ReserveCar()
	{
		// Take user input for car, location and payment preferences
	}

	public void MakePayment()
	{
		// Take user input to record payment
	}

}
