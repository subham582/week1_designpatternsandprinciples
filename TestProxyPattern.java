
public class TestProxyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Image image1 = new ProxyImage("photo1.jpg");
	     Image image2 = new ProxyImage("photo2.jpg");

	        image1.display();
	        System.out.println("");

	        
	        image1.display();
	        System.out.println("");

	        
	        image2.display();
	        System.out.println("");

	        
	        image2.display();

	}

}
