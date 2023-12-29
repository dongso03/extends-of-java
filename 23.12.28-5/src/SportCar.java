
public class SportCar extends Car {
	private boolean isTurbo;

	
	public SportCar(int speed, boolean isTurbo, String color) {
		super(speed, color);
		this.isTurbo = isTurbo;
	}

	public boolean isTurbo() {
		return isTurbo;
	}

	public void setTurbo(boolean isTurbo) {
		this.isTurbo = isTurbo;
	}

	

}
