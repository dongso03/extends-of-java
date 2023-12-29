
public class BulgogiPizza extends Pizza {
	private int gramOfBulgogi;
	//자식이 부모가 가진 똑같은값을 만들어도 컴파일에러x
	//private int price;

	public BulgogiPizza(int price, int gramOfBulgogi) {
		super(price);
		this.gramOfBulgogi = gramOfBulgogi;
	}

	public int getGramOfBulgogi() {
		return gramOfBulgogi;
	}

	public void setGramOfBulgogi(int gramOfBulgogi) {
		this.gramOfBulgogi = gramOfBulgogi;
	}
	

}
