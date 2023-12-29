
public class Magazine extends Book {
	private String ReleaseDate;

	public Magazine(String bookName, int page, String author, String releaseDate) {
		super(bookName, page, author);
		ReleaseDate = releaseDate;
	}

	public String getReleaseDate() {
		return ReleaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		ReleaseDate = releaseDate;
	}
	

}
