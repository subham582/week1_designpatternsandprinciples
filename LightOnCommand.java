
public class LightOnCommand implements Command {
	private Light light;

	public LightOnCommand(Light light) {
		// TODO Auto-generated constructor stub
		 this.light = light;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.turnOn();
		
	}

}
