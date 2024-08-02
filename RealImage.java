
public class RealImage implements Image {
	private String filename;

	public RealImage(String filename) {
		// TODO Auto-generated constructor stub
		this.filename = filename;
        loadImageFromDisk();
	}
	  private void loadImageFromDisk() {
	        System.out.println("Loading " + filename);
	        // Simulate loading from remote server
	        try {
	            Thread.sleep(2000); // Simulate delay
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void display() {
	        System.out.println("Displaying " + filename);
	    }

}
