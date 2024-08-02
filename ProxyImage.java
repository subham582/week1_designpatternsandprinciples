
public class ProxyImage implements Image{
	private RealImage realImage;
    private String filename;

	public ProxyImage(String filename) {
		// TODO Auto-generated constructor stub
		this.filename = filename;

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		 if (realImage == null) {
	            realImage = new RealImage(filename);
	        }
	        realImage.display();
		
	}

}
