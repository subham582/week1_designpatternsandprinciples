
public class SMSNotifierDecorator extends NotifierDecorator {

	public SMSNotifierDecorator(Notifier notifier) {
		// TODO Auto-generated constructor stub
		super(notifier);
	}
	
	public void send(String message) {
		super.send(message);
		sendSMS(message);
	}
	 private void sendSMS(String message) {
	        System.out.println("Sending SMS: " + message);
	    }

}
