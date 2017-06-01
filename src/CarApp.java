
public class CarApp {

	public static void main(String[] args) {
		Car blueHonda = new Car("blue Honda");
		Car yellowLemon = new Car("yellow lemon");
		blueHonda.start();
		blueHonda.getStatus();
		blueHonda.accelerate();
		blueHonda.accelerate(50);
		blueHonda.getSpeed();
		yellowLemon.setStatus("broken down");
		yellowLemon.setSpeed(0);
		yellowLemon.getStatus();
		yellowLemon.getSpeed();
		yellowLemon.setStatus("fixed");
		yellowLemon.getStatus();
		yellowLemon.start();
		yellowLemon.getStatus();
		yellowLemon.accelerate(5);
		yellowLemon.accelerate();
		yellowLemon.getSpeed();
		
	}

}
