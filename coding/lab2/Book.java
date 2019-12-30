package coding.lab2;

public class Book extends WritenItem{

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int uid, String title, int noc, String author) {
		super(uid, title, noc, author);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book [getAuthor()=" + getAuthor() + ", getUid()=" + getUid() + ", getTitle()=" + getTitle()
				+ ", hashCode()=" + hashCode() + ", getNoc()=" + getNoc() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + "]";
	}

}
