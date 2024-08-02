
public class AdapterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PayPal payPal = new PayPal();
        PaymentProcessor payPalAdapter = new PayPalAdapter(payPal);
        payPalAdapter.processPayment(100.0);

        // Using Stripe through the adapter
        Stripe stripe = new Stripe();
        PaymentProcessor stripeAdapter = new StripeAdapter(stripe);
        stripeAdapter.processPayment(200.0);

	}

}
