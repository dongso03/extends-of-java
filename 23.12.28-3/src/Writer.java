
public class Writer extends Person {
	private String masterpiece;

	public Writer(String name, String masterpiece) {
		super(name);
		this.masterpiece = masterpiece;

	}

	public String getMasterpiece() {
		return masterpiece;
	}

	public void setMasterpiece(String masterpiece) {
		this.masterpiece = masterpiece;
	}

}
