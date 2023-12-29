//동물원
//동물[]
//사자	몸무게,나이,육식
//꼬끼리 몸무게 나이 초식
//오리 몸무게 나이 날수있음 소리를냄
//독수리 몸무게 나이 날수있음 사냥을할수있음

public class Zoo {
	private Animal[] animal;

	public static void main(String[] args) {

		Duck duck = new Duck(1, 4);
		duck.fly();
		duck.Sound();
		Egle egle = new Egle(3, 5);
		egle.fly();
		egle.hunt();

		Lion lion = new Lion(150, 7);
		Elephant ele = new Elephant(1500, 6);

		Zoo zoo = new Zoo();
		zoo.animal = new Animal[4];
		zoo.animal[0] = duck;
		zoo.animal[1] = egle;
		zoo.animal[2] = lion;
		zoo.animal[3] = ele;

		for (int i = 0; i < zoo.animal.length; i++) {
			if (zoo.animal[i] instanceof Lion)
				System.out.println("사자인덱스" + i);
		}
		int count = 0;
		for (int i = 0; i < zoo.animal.length; i++) {
			if (zoo.animal[i] instanceof Bird) {
				count++;
			}
		}
		System.out.println("새는 총 몇마리:" + count);

		for (int i = 0; i < zoo.animal.length; i++) {
			if (zoo.animal[i] instanceof Elephant) {
				System.out.println("꼬끼리 몸무게: " + zoo.animal[i].getWeight());
			}
		}

		for (int i = 0; i < zoo.animal.length; i++) {
			if (zoo.animal[i] instanceof Duck) {
				Duck down = (Duck) zoo.animal[i];
				down.Sound(); 
			}
		}


	}
}
