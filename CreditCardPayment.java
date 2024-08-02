
public class CreditCardPayment implements PaymentStrategy {
	private String cardNumber;
    private String cardHolderName;
    private String cvv;

	public CreditCardPayment(String cardNumber, String cardHolderName, String cvv) {
		// TODO Auto-generated constructor stub
		this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cvv = cvv;
	}

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Paid " + amount + " using Credit Card.");
		
	}

}
