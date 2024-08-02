package abc;

public class LoggerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to test the singelton pattern of logger class..
		Logger logger1 = Logger.getInstance();
		Logger logger2 = Logger.getInstance();

	        // Log some messages
	        logger1.log("This is the first log message.");
	        logger2.log("This is the second log message.");

	        // Verify that both references point to the same instance
	        if (logger1 == logger2) {
	            System.out.println("Both logger1 and logger2 are the same instance.");
	        } 
	        else {
	            System.out.println("logger1 and logger2 are different instances.");
	        }

	}

}
