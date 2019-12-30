package coding.lab2;

public class JournalPaper extends WritenItem{
private int year;

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

@Override
public String toString() {
	return "JournalPaper [year=" + year + "]";
}

public JournalPaper() {
	super();
	// TODO Auto-generated constructor stub
}

public JournalPaper(int uid, String title, int noc, String author,int year) {
	super(uid, title, noc, author);
	// TODO Auto-generated constructor stub
	this.year = year;
}


}
