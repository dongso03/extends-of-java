
public class Truck extends Car {
	private int maxWei;

	

	public Truck(int speed, int maxWei,String color) {
		super(speed, color);
		this.maxWei = maxWei;
	}

	public int getMaxWei() {
		return maxWei;
	}

	public void setMaxWei(int maxWei) {
		this.maxWei = maxWei;
	}

}
