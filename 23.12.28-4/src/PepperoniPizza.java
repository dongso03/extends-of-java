
public class PepperoniPizza extends Pizza{
	
	private int peperoniAmount;

	public PepperoniPizza(int price, int peperoniAmount) {
		super(price);
		this.peperoniAmount = peperoniAmount;
	}

	public int getPeperoniAmount() {
		return peperoniAmount;
	}

	public void setPeperoniAmount(int peperoniAmount) {
		this.peperoniAmount = peperoniAmount;
	}


	
	
 
}
