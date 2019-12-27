package coding.lab2;

public class Video extends MediaItem {
private String director;
private String genre;
private int vyear;
public String getDirector() {
	return director;
}
public void setDirector(String director) {
	this.director = director;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public int getVyear() {
	return vyear;
}
public void setVyear(int vyear) {
	this.vyear = vyear;
}
@Override
public String toString() {
	return "Video [director=" + director + ", genre=" + genre + ", vyear=" + vyear + "]";
}
public Video() {
	super();
	// TODO Auto-generated constructor stub
}
public Video(int uid, String title, int noc, int length) {
	super(uid, title, noc, length);
	// TODO Auto-generated constructor stub
}
public Video(int length) {
	super(length);
	// TODO Auto-generated constructor stub
}

}
