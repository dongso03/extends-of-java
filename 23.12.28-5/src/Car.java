
public class Car {
	private int speed;
	private String color;
	
	public Car(int speed, String color) {
		super();
		this.speed = speed;
		this.color = color;
	}
	public void increaseSpeed() {
		speed++;
	}
	
	public void decreaseSpees() {
		speed--;
	}
}