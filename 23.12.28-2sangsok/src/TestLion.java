
public class TestLion {
	public static void main(String[] args) {
		//객체 다형성
		
		
		Lion l = new Lion(1500, 7);

		System.out.println("사자무게" + l.getWeight());
		System.out.println("사자나이" + l.getAge());
		l.eatMeat();

		Elephant e = new Elephant(4000, 7);
		System.out.println("콖리무게" + e.getWeight());
		System.out.println("코끼리 나이" + e.getAge());
		e.eatgrass();
		
		Animal a = new Animal(3000, 4);
		a.setAge(7);
		a.setWeight(3500);
	}
}
