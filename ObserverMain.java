
public class ObserverMain {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp("MobileApp1");
        Observer webApp = new WebApp("WebApp1");

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setStockPrice(100.00);
        System.out.println("");

        stockMarket.setStockPrice(105.50);
        System.out.println("");

        stockMarket.removeObserver(mobileApp);
        stockMarket.setStockPrice(98.75);

	}

}
