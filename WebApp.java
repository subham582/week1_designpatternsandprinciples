
public class WebApp implements Observer {
	 private String name;

	public WebApp(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		
	}

	@Override
	public void update(double stockPrice) {
		// TODO Auto-generated method stub
		 System.out.println(name + " received stock price update: " + stockPrice);
		
	}

}
