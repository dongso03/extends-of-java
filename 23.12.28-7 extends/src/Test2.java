

// 삼각형
// 높이
// 밑변
// 넓이 출력 기능

// 직사각형
// 가로
// 세로
// 넓이 출력 기능

// 원
// 반지름
// 넓이 출력 기능

public class Test2 {
	public static void main(String[] args) {

		Triangle t = new Triangle(30, 50);
		Rectangle r = new Rectangle(60, 20);
		Circle c = new Circle(15);
	
		System.out.println(t.area(t));
		System.out.println(r.RecArea(r));
		System.out.println(c.CicleArea(c));
		
	}

}
