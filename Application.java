import java.util.Scanner;

public class Application
{
	public static void main(String args[])
	{
		// Create customer object and call methods to simulate the menu flow
    // Create customer object and call methods to simulate the menu flow

    Scanner input = new Scanner(System.in);

    System.out.println("\n\n************************************************************************************\n\n");
    System.out.println("\nDear valued customer, \n\nWelcome to CRAM (Car Rental Application Management) System.");
    System.out.println("\nPlease enter your name:");


    String userName = input.nextLine();
		System.out.println("\n\n************************************************************************************\n\n");

    Customer customer = new Customer(userName);
    //System.out.println(customer.name);

    customer.getInput();

	}

}
