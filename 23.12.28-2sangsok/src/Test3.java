
public class Test3 {
	public static void main(String[] args) {
		//Animal ani = new Animal(2000,3);
		
		Elephant e = new Elephant(4300, 7);
		Animal a = e;
		System.out.println(a instanceof Elephant);
		System.out.println(a instanceof Lion);
		System.out.println(a instanceof Animal);
		
		if ( a instanceof Elephant) {
			Elephant down = (Elephant) a;
			
		}
		
		//Animal a = e;
		//Lion l  =(Lion) a;
		//하향 형변환은 실제 인스턴스의 형을 주의 해야 한다.
		//Lion lion  =(Lion) ani;
		//System.out.println("프로그램 정상종료");
	}
}
