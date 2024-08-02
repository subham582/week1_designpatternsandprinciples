
public class SlackNotifierDecorator extends NotifierDecorator {

	public SlackNotifierDecorator(Notifier notifier) {
		// TODO Auto-generated constructor stub
		super(notifier);
	}
	 @Override
	    public void send(String message) {
	        super.send(message);
	        sendSlack(message);
	    }

	    private void sendSlack(String message) {
	        System.out.println("Sending Slack message: " + message);
	    }

}
