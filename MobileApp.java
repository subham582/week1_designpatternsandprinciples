
public class MobileApp implements Observer {
	private String name;

	public MobileApp(String name) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(double stockPrice) {
		// TODO Auto-generated method stub
        System.out.println(name + " received stock price update: " + stockPrice);

		
	}

}
