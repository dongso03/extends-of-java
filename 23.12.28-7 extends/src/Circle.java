
public class Circle extends Figure{
	private final double PI = 3.14;

	public Circle(int length) {
		super(length);
		// TODO Auto-generated constructor stub
	}
	
	public double CicleArea(Circle c) {
		double a = 0;
		a = c.getLength() * c.getLength() * PI;
		return a;
	}


	
	
}
