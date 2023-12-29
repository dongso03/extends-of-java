class MySub extends MySuper{
	public MySub() {
		super();
		System.out.println("자식클래스 생성ㅅ자가 호출됨");
	}
}


public class MySuper {
	public MySuper() {
		System.out.println("부모클래스 생성자가 호출됨");
	}
	public static void main(String[] args) {
		MySub mySub = new MySub();
		
	}
}
