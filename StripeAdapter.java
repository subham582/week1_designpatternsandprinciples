
public class StripeAdapter implements PaymentProcessor {
	private Stripe stripe;

	public StripeAdapter(Stripe stripe) {
		// TODO Auto-generated constructor stub
		this.stripe = stripe;
	}

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		stripe.sendPayment(amount);
		
	}

}
