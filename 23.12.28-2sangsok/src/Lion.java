// 상속으로 만들어진 개념을
//is-a 관계라고 한다
public class Lion extends Animal {
	public Lion(int weight, int age) {
		super(weight,age);
	}
	
	public void eatMeat() {
		System.out.println("사자는 고기먹습니다.");
	}
	
	
}
