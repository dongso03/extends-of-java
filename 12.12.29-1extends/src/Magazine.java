
public class Magazine extends Book {
	private String releaseDate;

	public Magazine(String bookName, int page, String author, String releaseDate) {
		super(bookName, page, author);
		this.releaseDate = releaseDate;
	}
	
	@Override // annotation
	public void printAll() {
		super.printAll();
		System.out.println("발매일: "+releaseDate);
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
}
