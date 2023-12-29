// Book 클래스
//1. 필드정보
// 제목 페이지수 저자명
//2. 메소드
// 모든필드를 출력할수 있ㅇ는 메소드

// 매거진 클래스
// 제목 페이지수 저자명 발매일

//각각 클래스에 모든 필드를 초기화하는 생성자
//게터세터

public class Test {
	public static void main(String[] args) {

		Book b = new Book("재욱이의 모험", 450, "강재욱");
		Magazine m = new Magazine("추적 재욱", 60, "김동수", "2023년 12월");
		
		System.out.println(b.getBookName());
		System.out.println(b.getPage());
		System.out.println(b.getAuthor());
		
		System.out.println(m.getBookName());
		System.out.println(m.getPage());
		System.out.println(m.getAuthor());
		System.out.println(m.getReleaseDate());
	}
}
