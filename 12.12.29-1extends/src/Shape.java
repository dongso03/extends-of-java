
public class Shape {
	public void printArea() {

	}
}

class Triangle extends Shape {
	private int height;
	private int length;

	public Triangle(int height, int length) {
		super();
		this.height = height;
		this.length = length;
	}

	@Override
	public void printArea() {
		System.out.println("삼각형 넓이 : " + (height * length / 2));
	}

}

class Rectangle extends Shape {
	private int height;
	private int length;

	public Rectangle(int height, int length) {
		super();
		this.height = height;
		this.length = length;
	}

	@Override
	public void printArea() {
		System.out.println("사각형의 넓이 : " + (length * height));
	}
}

	class Circle extends Shape {
		private int radius;

		public Circle(int radius) {
			super();
			this.radius = radius;
		}

		@Override
		public void printArea() {
			System.out.println("원넓이 : " + (radius * radius * 3.14));
		}

	
}