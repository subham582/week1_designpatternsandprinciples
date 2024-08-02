
public class TestDecoratorPattern {
	 public static void main(String[] args) {
	        Notifier notifier = new EmailNotifier();
	        notifier.send("Hello!");

	        System.out.println();

	        Notifier smsNotifier = new SMSNotifierDecorator(new EmailNotifier());
	        smsNotifier.send("Hello!");

	        System.out.println();

	        Notifier slackNotifier = new SlackNotifierDecorator(new EmailNotifier());
	        slackNotifier.send("Hello!");

	        System.out.println();

	        Notifier allNotifier = new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
	        allNotifier.send("Hello!");
	    }

}
