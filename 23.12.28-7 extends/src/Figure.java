
public class Figure {

	private int length;
	private int width;
	
	public Figure(int length) {
		super();
		this.length = length;
		
	}
	

	public Figure(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
