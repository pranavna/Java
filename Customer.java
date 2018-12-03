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
    System.out.println("\n\n************************************************************************************\n\n");


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
        this.makePayment(this.name);
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

	public void makePayment(String name)
	{
  		// Display menu options, take user input and call other methods based on input
      Payment payment = new Payment(name);
      Pay p1;
      System.out.println(payment);
      Scanner input = new Scanner(System.in);

      System.out.println("\n\n************************************************************************************\n\n");
      System.out.println("\nHello "+this.name+",\nWhat would you like to do?");
      System.out.println("\nChoose option:\n\t1. Pay by Cash.");
      System.out.println("\t2. Pay through PayPal");
      System.out.println("\t3. Pay using your card.");
      System.out.println("\n\n************************************************************************************\n\n");


      int c = input.nextInt();
      switch (c)
      {
        case 2:
        p1 = payment.selectPay("Card");
        payment.mypay(p1);

          break;
        case 1:
        p1=  payment.selectPay("Cash");
        payment.mypay(p1);

          break;
        case 3:

        p1=  payment.selectPay("sd");
        payment.mypay(p1);

          break;
        default:
          System.out.println("Invalid Input");
          break;
      }

  	}
		// Take user input to record payment




}
