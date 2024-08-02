
public class StrategyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PaymentContext context = new PaymentContext();

	        PaymentStrategy creditCardPayment = new CreditCardPayment("1234567890123456", "John Doe", "123");
	        context.setPaymentStrategy(creditCardPayment);
	        context.executePayment(100.0);

	        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com", "password123");
	        context.setPaymentStrategy(payPalPayment);
	        context.executePayment(200.0);

	}

}
