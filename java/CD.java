package coding.lab2;

public class CD extends MediaItem{
private String artist;
private String cgenre;
public String getArtist() {
	return artist;
}
public CD(){}

public void setArtist(String artist) {
	this.artist = artist;
}
public String getCgenre() {
	return cgenre;
}
public void setCgenre(String cgenre) {
	this.cgenre = cgenre;
}
public CD(int length, String artist, String cgenre) {
	super(length);
	this.artist = artist;
	this.cgenre = cgenre;
}
@Override
public String toString() {
	return "CD [artist=" + artist + ", cgenre=" + cgenre + "]";
}


}
