
public class CarApp {

	public static void main(String[] args) {
		Car blueHonda = new Car("blue Honda");
		Car yellowLemon = new Car("yellow lemon");
		blueHonda.setStatus("Starting");
		blueHonda.getStatus();
		blueHonda.accelerate();
		blueHonda.setSpeed(50);
		blueHonda.getSpeed();
		yellowLemon.setStatus("broken down");
		yellowLemon.setSpeed(0);
		yellowLemon.getStatus();
		yellowLemon.getSpeed();
		yellowLemon.setStatus("fixed");
		yellowLemon.getStatus();
		yellowLemon.setStatus("starting");
		yellowLemon.getStatus();
		yellowLemon.setSpeed(5);
		yellowLemon.getSpeed();

	}

}
