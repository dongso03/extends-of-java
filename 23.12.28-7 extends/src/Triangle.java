
public class Triangle extends Figure {

	public Triangle(int line,int line2) {
		super(line,line2);
	}

	public int area(Triangle t) {
		int a = 0;
		a= t.getLength() * t.getWidth() /2;
		return a;
	}

}
