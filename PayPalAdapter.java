
public class PayPalAdapter implements PaymentProcessor {
	private PayPal payPal;

	public PayPalAdapter(PayPal payPal) {
		// TODO Auto-generated constructor stub
		this.payPal = payPal;
	}

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		payPal.makePayment(amount);
		
	}

}
