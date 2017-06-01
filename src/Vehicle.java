
public class Vehicle {
	private String type;
	private int speed = 0;
	private String status;
	
	public void setType(String type){
		this.type = type;
	}
	
	public void start(){
		print(String.format("The %s is starting.", type));
		status = "started";
	}
	
	public void off(){
		print(String.format("The %s turning off.", type));
		speed = 0;
	}
	
	public void accelerate(){
		accelerate(speed + 1);
	}
	
	public void accelerate(int toSpeed){
		if (status.equals("started")) {
			print(String.format("The %s is accelerating to %d MPH.", type, toSpeed));
			speed = toSpeed;
		} else print("you must start the car before you can accelerate");
	}
	
	public void getSpeed(){
		print(String.format("The %s is going %d MPH.", type, speed));
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void getStatus(){
		print(String.format("The %s is %s", type, status));
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void print(String string){
		System.out.println(string);
	}
	
}