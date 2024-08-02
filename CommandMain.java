
public class CommandMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Light livingRoomLight = new Light();

	        Command lightOn = new LightOnCommand(livingRoomLight);
	        Command lightOff = new LightOffCommand(livingRoomLight);

	        RemoteControl remote = new RemoteControl();

	        
	        remote.setCommand(lightOn);
	        remote.pressButton();

	        
	        remote.setCommand(lightOff);
	        remote.pressButton();

	}

}
