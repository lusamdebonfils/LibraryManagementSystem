package business;

public class Author extends Person{
	
	
	private String authorCredentials;
	private String authorBio;
	private Book book;
	
	Author(String firstName, String lastName, String phone, String authorCredentials, String authorBio, Book book) {
		super(firstName, lastName, phone, null);
		this.authorCredentials = authorCredentials;
		this.authorBio = authorBio;
		book.setAuthor(this);
	}

	public String getAuthorCredentials() {
		return authorCredentials;
	}

	public void setAuthorCredentials(String authorCredentials) {
		this.authorCredentials = authorCredentials;
	}

	public String getAuthorBio() {
		return authorBio;
	}

	public void setAuthorBio(String authorBio) {
		this.authorBio = authorBio;
	}

	@Override
	public String toString() {
		return "Author [authorCredentials=" + authorCredentials + ", authorBio=" + authorBio + "]";
	}
	
	

}
