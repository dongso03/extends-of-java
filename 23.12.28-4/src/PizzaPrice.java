
public class PizzaPrice {
	public static void main(String[] args) {
		PepperoniPizza[] pepper = new PepperoniPizza[] { new PepperoniPizza(10000, 20), new PepperoniPizza(15000, 25),
				new PepperoniPizza(20000, 30) };

		int sum = 0;
		for (int i = 0; i < pepper.length; i++) {
			sum += pepper[i].getPrice();
		}

		BulgogiPizza[] bulgogi = new BulgogiPizza[] { new BulgogiPizza(10000, 200), new BulgogiPizza(15000, 250),
				new BulgogiPizza(20000, 300) };

		int sum2 = 0;
		for (int i = 0; i < bulgogi.length; i++) {
			sum2 += bulgogi[i].getPrice();
		}
		System.out.println(sum + sum2);

		// 위처럼 두개만들필요없이 Pizza로 통일가능

		Pizza[] pepper1 = new Pizza[] { new PepperoniPizza(10000, 20), new PepperoniPizza(15000, 25),
				new PepperoniPizza(20000, 30), new BulgogiPizza(20000, 300), new BulgogiPizza(10000, 200),
				new BulgogiPizza(15000, 250) };

		int sum3 = 0;
		for (int i = 0; i < pepper1.length; i++) {
			sum3 += pepper1[i].getPrice();
		}
		System.out.println(sum3);
		
		int count = 0;
		for ( int i = 0; i< pepper1.length;i++) {
			if(pepper1[i] instanceof PepperoniPizza) {
			PepperoniPizza down = (PepperoniPizza)pepper1[i];
			count += down.getPeperoniAmount();
			}
			
		}
		System.out.println(count);
		
		// 불고기 그램수 총합
		int count2 = 0;
		for ( int i = 0; i< pepper1.length;i++) {
			if(pepper1[i] instanceof BulgogiPizza) {
			BulgogiPizza down = (BulgogiPizza)pepper1[i];
			count2 += down.getGramOfBulgogi();
			}
		}
		System.out.println(count2);
	}
}
