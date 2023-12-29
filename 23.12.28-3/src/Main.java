
public class Main {
	public static void main(String[] args) {
		Student s = new Student("길동",90);
		System.out.println(s.getName());
		System.out.println(s.getScore());
		
		Writer w = new Writer("재욱", "은밀한 사생활");
		System.out.println(w.getName());
		System.out.println(w.getMasterpiece());
	}
}
