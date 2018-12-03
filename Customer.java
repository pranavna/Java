import java.util.Scanner;

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

    Scanner input = new Scanner(System.in);

    System.out.println("\n************************************************************************************");
    System.out.println("\nHello "+this.name+",\nWhat would you like to do?");
    System.out.println("\nChoose option:\n\tS. Search for car at your nearest location.");
    System.out.println("\tR. Reserve a car.");
    System.out.println("\tP. Pay and check-out.");

    char c = input.next().charAt(0);
    switch (c)
    {
      case 'S':
        this.searchCar();
        break;
      case 'R':
        this.reserveCar();
        break;
      case 'P':
        this.makePayment();
        break;
      default:
        System.out.println("Invalid Input");
        break;
    }

	}

	public void searchCar()
	{
		// Take user input and display Cars available based on preferences
	}

	public void reserveCar()
	{
		// Take user input for car, location and payment preferences
	}

	public void makePayment()
	{
		// Take user input to record payment
	}

}
