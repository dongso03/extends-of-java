// 자동차
//속도
//가속
//감속

//스포츠카 >> 터보기능 유무 추가

// 트럭>>최대 적재중량 추가
public class Main {
	public static void main(String[] args) {
		
		SportCar sp = new SportCar(180, true,"빨간색");
		Truck t = new Truck(40, 15000,"회색");

		t.increaseSpeed();
		t.decreaseSpees();
		t.decreaseSpees();
		System.out.println(t.getMaxWei());
		System.out.println();
		
		
	}
}
