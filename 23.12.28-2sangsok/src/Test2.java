
public class Test2 {
	public static void main(String[] args) {
		Lion l = new Lion(1000, 8);
		
		l.eatMeat();
	    l.getAge();
		l.getWeight();
		
	
		//상향 형변환 (upcasting)
		Animal a= (Animal)new Lion(1500, 9);
		a.getAge();
		a.getWeight();
		//Animal 형을 띄게 했기에 Lion에 있는 메소드를 쓸수가 없다.
		//a.eatMeat();
		
		//하향 형변환
		Lion lion = (Lion) a;
		lion.eatMeat();
	}
}
