
public class Animal {

	private int weight;
	private int age;

	public Animal() {

	}

	public void eatMeat() {

		System.out.println("육식을 함");

	}

	public void eatGrass() {

		System.out.println("초식을 함");
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Animal(int weight, int age) {
		super();

		this.weight = weight;
		this.age = age;
	}
}
