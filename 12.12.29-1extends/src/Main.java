class MySuper{
	public void printHllo() {
		System.out.println("hello");
	}
}

class MySub extends MySuper	{
	public void printHollo() {
		super.printHllo();
		System.out.println("hi");
	}
}



public class Main {
	public static void main(String[] args) {
		MySuper sup = new MySuper();
		sup.printHllo();
		System.out.println();
		MySub sub = new MySub();
		sub.printHllo();
		
	}
}
