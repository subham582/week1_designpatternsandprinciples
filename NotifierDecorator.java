
public abstract class NotifierDecorator implements Notifier {
	protected Notifier wrappedNotifier;

	public NotifierDecorator(Notifier notifier) {
		// TODO Auto-generated constructor stub
		this.wrappedNotifier = notifier;
	}
	public void send(String message) {
		wrappedNotifier.send(message);
	}

}
