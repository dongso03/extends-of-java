
public class Rectangle extends Figure {

	public Rectangle(int length, int width) {
		super(length, width);
	}

	public int RecArea(Rectangle r) {
		int a = 0;
		a = r.getLength() * r.getWidth();
		return a;
	}
}
