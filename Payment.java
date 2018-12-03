public class Payment {
    private String name;

    public Payment (String myName) {
	name = myName;
    }

    public String toString () {
	return("Customer -- " + name + ": ");
    }

    public Pay selectPay (String select) {
	if ("Card".equals(select)) {
	    return new CreditCard();
	} else if ("Cash".equals(select)) {
			return new Cash();
	}
		else {
	    return new PayPal();
	}
    }

    public void mypay (Pay mypaymethod) {
	mypaymethod.initCard();
	mypaymethod.payUsingCard();
    }



}
