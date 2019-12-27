package coding.lab2;

public class WritenItem extends Item {
private String author;
public WritenItem(){}



@Override
public String toString() {
	return "WritenItem [author=" + author + "]";
}



public WritenItem(int uid, String title, int noc,String author) {
	super(uid, title, noc);
	this.author=author;
}


public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

}
