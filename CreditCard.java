import java.util.Scanner;
public class CreditCard extends Pay {
    public void  initCard () {
    }
    public void payUsingCard() {
			Scanner input = new Scanner(System.in);

			System.out.println("\n\n************************************************************************************\n\n");
	    System.out.println("\nDear valued customer, \n\nPlease enter Card Details");
	    System.out.println("\nCard Number:");

	    String Card = input.nextLine();
			System.out.println("Thanks\n");
			System.out.println("\n\n************************************************************************************\n\n");

    }
}
